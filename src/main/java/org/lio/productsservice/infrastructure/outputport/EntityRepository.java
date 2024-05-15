package org.lio.productsservice.infrastructure.outputport;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityRepository {
    public <T> T createProducts(T reg);

    public <T> List<T> getAllProducts(Class<T> clazz);

    public <T> Boolean deleteProductById(T reg);
}
