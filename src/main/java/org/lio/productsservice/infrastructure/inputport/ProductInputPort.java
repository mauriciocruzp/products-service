package org.lio.productsservice.infrastructure.inputport;

import org.lio.productsservice.domain.Product;
import org.lio.productsservice.infrastructure.ProductModel;

import java.util.List;

public interface ProductInputPort {
    public ProductModel createProduct(String name, Float price, Integer quantity);

    public List<Product> getAllProducts();

    public Boolean deleteProductById(String id);
}
