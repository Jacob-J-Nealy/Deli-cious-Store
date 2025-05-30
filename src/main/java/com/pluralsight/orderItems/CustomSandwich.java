package com.pluralsight.orderItems;

import com.pluralsight.Priceable;
import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;

import java.util.List;

public class CustomSandwich implements Priceable {

    //Properties
    private int size;
    private Bread bread;
    private List<Toppings> toppingsList;
    private boolean isToasted;

    //Constructor
    public CustomSandwich(int size, Bread bread, List<Toppings> toppingsList, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.toppingsList = toppingsList;
        this.isToasted = isToasted;
    }

    @Override
    public String toString() {
        return "CustomSandwich{" +
                "size=" + size +
                ", bread=" + bread +
                ", toppingsList=" + toppingsList +
                ", isToasted=" + isToasted +
                '}';
    }

    private void getBread() {
    }

    private void getToppings() {

    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
