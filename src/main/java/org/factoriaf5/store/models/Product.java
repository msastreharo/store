package org.factoriaf5.store.models;

public class Product {
    private final String name;
    private double price;

    public Product(String name, double price){
        this.price = price;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
