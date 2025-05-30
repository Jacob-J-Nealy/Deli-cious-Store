package com.pluralsight.orderItems.customSandwichParts;

public abstract class Toppings {

    // Toppings Properties
    private String name;
    private boolean isPremium;


    // Toppings Constructor
    public Toppings(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    // Toppings toString
    @Override
    public String toString() {

        // String Builder Drink Builder
        StringBuilder toppingsBuilder = new StringBuilder();
        toppingsBuilder.append("- ").append(name);

        return toppingsBuilder.toString();
    }

    // Toppings Methods
    public abstract double calculatePrice(int size);


    // Getters & Setters
    public String getName() {
        return name;
    }
    public boolean isPremium() {
        return isPremium;
    }

}
