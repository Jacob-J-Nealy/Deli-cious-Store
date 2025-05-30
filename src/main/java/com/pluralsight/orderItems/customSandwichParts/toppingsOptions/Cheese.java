package com.pluralsight.orderItems.customSandwichParts.toppingsOptions;

import com.pluralsight.orderItems.customSandwichParts.Toppings;

public class Cheese extends Toppings {

    // Cheese Constructor
    public Cheese(String name, boolean isPremium) {
        super(name, true);
    }

    @Override
    public double calculatePrice(int size) {
        if (size == 4) {
            return 0.75;
        }

        if (size == 8) {
            return 1.50;
        }

        if (size == 12) {
            return 2.25;
        }

        return 0;
    }
}
