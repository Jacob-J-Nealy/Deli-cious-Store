package com.pluralsight.orderItems;

import com.pluralsight.Priceable;
import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;

import java.util.List;

public class CustomSandwich implements Priceable {

    //Properties
    private int size;
    private Bread bread;
    private boolean toasted;
    private List<Toppings> toppingsList;

    private void getBread() {
    }

    private void getToppings() {

    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
