package com.pluralsight.orderItems;

import com.pluralsight.Priceable;
import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Cheese;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Meat;

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

        double total = 0;

        if (size == 4) {
            total += 5.50;
        }

        if (size = 8) {
            total += 7.00;
        }

        int meatCount = 0;
        int cheeseCount = 0;


        for (Toppings toppings : toppingsList) {
            if (toppings instanceof Meat) {
                meatCount++;
            }

            if (toppings instanceof Cheese) {
                cheeseCount++;
            }
        }




        return total;
    }
}
