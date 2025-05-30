package com.pluralsight.orderItems.customSandwichParts;

import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Cheese;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Meat;

public class Bread {

    //Properties
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    // Bread toString
    @Override
    public String toString() {
        return type;
    }

}
