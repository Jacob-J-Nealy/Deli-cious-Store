package com.pluralsight.orderItems.customSandwichParts.toppingsOptions;

import com.pluralsight.orderItems.customSandwichParts.Toppings;

public class RegularToppings extends Toppings {

    // Regular Toppings Constructor
    public RegularToppings(String name, boolean isPremium) {
        super(name, false);
    }

    @Override
    public double calculatePrice(int size) {
        return 0; // Regular Toppings are Free
    }
}
