package com.pluralsight.orderItems.customSandwichParts.toppingsOptions;

import com.pluralsight.orderItems.customSandwichParts.Toppings;

public class Sauce extends Toppings {

    // Sauce Constructor
    public Sauce(String name, boolean isPremium) {
        super(name, isPremium);
    }

    @Override
    public double calculatePrice(int size) {
        return 0; // Sauces are free
    }
}
