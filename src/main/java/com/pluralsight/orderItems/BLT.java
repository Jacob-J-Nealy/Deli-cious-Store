package com.pluralsight.orderItems;

import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Cheese;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Meat;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.RegularToppings;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Sauce;

import java.util.Arrays;

public class BLT extends CustomSandwich {

    public BLT() {
        super(
                8,
                new Bread("White"),
                Arrays.asList(
                        new Meat("Bacon", true),
                        new Cheese("Cheddar", true),
                        new RegularToppings("Lettuce", false),
                        new RegularToppings("Tomato", false),
                        new Sauce("Ranch", false)

                ),
                true
        );
    }
}
