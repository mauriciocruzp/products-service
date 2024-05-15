package org.lio.productsservice.infrastructure.outputadapter.mysqlrepository;

import org.lio.productsservice.domain.Product;
import org.lio.productsservice.infrastructure.ProductModel;
import org.lio.productsservice.infrastructure.ProductRepository;
import org.lio.productsservice.infrastructure.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MysqlRepository implements EntityRepository {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public <T> T createProducts(T reg) {
        ProductModel product = productRepository.save((ProductModel) reg);

        return (T) product;
    }

    @Override
    public <T> List<T> getAllProducts(Class<T> clazz) {
        List<ProductModel> products = productRepository.findAll();

        return (List<T>) products;
    }

    @Override
    public <T> Boolean deleteProductById(T reg) {
        productRepository.deleteById((String) reg);

        return Boolean.TRUE;
    }
}