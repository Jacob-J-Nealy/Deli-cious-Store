package com.pluralsight.orderItems.customSandwichParts;

public abstract class Toppings {

    private String name;
    private boolean isPremium;

    public Toppings(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }
}
