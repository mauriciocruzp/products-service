package org.lio.productsservice.infrastructure.inputadapter.http;

import org.lio.productsservice.domain.Product;
import org.lio.productsservice.infrastructure.ProductModel;
import org.lio.productsservice.infrastructure.inputport.ProductInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductApi {
    @Autowired
    ProductInputPort productInputPort;

    @PostMapping(value = "/")
    public ProductModel createProduct(@RequestBody Product product) {
        return productInputPort.createProduct(product.getName(), product.getPrice(), product.getQuantity());
    }

    @GetMapping(value = "/")
    public List<Product> getAllProducts() {
        return productInputPort.getAllProducts();
    }

    @DeleteMapping(value = "/{id}")
    public Boolean deleteProductById(@PathVariable String id) {
        return productInputPort.deleteProductById(id);
    }
}
