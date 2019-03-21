package com.procourier.model;

import java.util.Objects;

public final class Seller {
    private String name;
    private Address address;
    private String descrisption;

    public Seller(String name, Address address) {
        this(name, "", address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getDescrisption() {
        return descrisption;
    }

    public Seller(String name, String descrisption, Address address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
        this.descrisption = Objects.requireNonNull(descrisption);
    }
}
