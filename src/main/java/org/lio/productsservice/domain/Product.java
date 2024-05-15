package org.lio.productsservice.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private Float price;
    private Integer quantity;
}