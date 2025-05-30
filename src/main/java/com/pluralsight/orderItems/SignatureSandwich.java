package com.pluralsight.orderItems;

import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;

import java.util.List;

public abstract class SignatureSandwich extends CustomSandwich {
    public SignatureSandwich(int size, Bread bread, List<Toppings> toppingsList, boolean isToasted) {
        super(size, bread, toppingsList, isToasted);
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
