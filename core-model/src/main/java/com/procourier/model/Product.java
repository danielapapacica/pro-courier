package com.procourier.model;

import java.util.Objects;

public class Product {
    private Long price;
    private String name;
    private String descriere;
    private Long weight;

    public Product( Long price,
             String name,
             String descriere,
             Long weight){
        this.price = Objects.requireNonNull(price) ;
        this.name = Objects.requireNonNull(name);
        this.descriere = Objects.requireNonNull(descriere);
        this.weight = Objects.requireNonNull(weight);
    }

    public static void main(String args[]){
        final Product product = new Product(12L, null, "ceaaa", 24L);
    }

}
