package org.lio.productsservice.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@Builder
public class ProductModel {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private Float price;

    @Column
    private Integer quantity;

    public ProductModel(String id, String name, Float price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductModel() {

    }
}
