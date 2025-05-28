package com.pluralsight;

public class Chips implements Priceable {

    //Properties
    private String name;
    private double price;

    public Chips(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
