package com.pluralsight.orderItems.customSandwichParts.toppingsOptions;

import com.pluralsight.orderItems.customSandwichParts.Toppings;

public class Meat extends Toppings {


    // Meats Constructor
    public Meat(String name, boolean isPremium) {
        super(name, true);
    }

    @Override
    public double calculatePrice(int size) {
        if (size == 4) {
            return 1.00;
        }

        if (size == 8) {
            return 2.00;
        }

        if (size == 12) {
            return 3.00;
        }

        return 0;
    }
}
