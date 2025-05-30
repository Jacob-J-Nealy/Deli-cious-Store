package com.pluralsight.orderItems;

import com.pluralsight.Priceable;

public class Chips implements Priceable {

    //Properties
    private String name;

    // Chips Constructor
    public Chips(String name) {
        this.name = name;
    }

    // Chips toString
    @Override
    public String toString() {

        // String Builder Drink Builder
        StringBuilder chipBuilder = new StringBuilder();
        chipBuilder.append(name).append(" ");
        chipBuilder.append("-").append(" ");
        chipBuilder.append(String.format("$%.2f", calculatePrice()));

        return chipBuilder.toString();
    }

    // Chips Methods
    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        return 1.50; // All Chips cost the same amount
    }



}
