package com.procourier.model;

import java.util.Objects;

public final class Product {
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
        this.weight = checkWeight(weight);
    }

    private static Long checkWeight(Long weight){
        if(weight < 0){
            throw new IllegalArgumentException("Weight must be non negative");
        }
        return Objects.requireNonNull(weight);
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescriere() {
        return descriere;
    }

    public Long getWeight() {
        return weight;
    }
}
