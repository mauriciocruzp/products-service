package org.lio.productsservice.application;

import org.lio.productsservice.domain.Product;
import org.lio.productsservice.infrastructure.ProductModel;
import org.lio.productsservice.infrastructure.inputport.ProductInputPort;
import org.lio.productsservice.infrastructure.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProductUseCase implements ProductInputPort {
    @Autowired
    EntityRepository entityRepository;

    @Override
    public ProductModel createProduct(String name, Float price, Integer quantity) {
        ProductModel product = ProductModel.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .price(price)
                .quantity(quantity)
                .build();

        return entityRepository.createProducts(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return entityRepository.getAllProducts(Product.class);
    }

    @Override
    public Boolean deleteProductById(String id) {
        return entityRepository.deleteProductById(id);
    }
}
