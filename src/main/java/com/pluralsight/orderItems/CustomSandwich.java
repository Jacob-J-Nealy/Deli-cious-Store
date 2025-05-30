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

    // CustomSandwich toString
    @Override
    public String toString() {

        // String Builder Drink Builder
        StringBuilder sandwichBuilder = new StringBuilder();
        sandwichBuilder.append("\nCustom Sandwich ").append(size).append("'");
        sandwichBuilder.append("\n").append(bread).append(" Toasted: ").append(isToasted);
        sandwichBuilder.append("\n").append(toppingsList);
        sandwichBuilder.append("\n").append(String.format("$%.2f", calculatePrice()));

        return sandwichBuilder.toString();
    }

    private void getBread() {
    }

    private void getToppings() {

    }

    @Override
    public double calculatePrice() {

        double total = 0;
        if (size == 4)  {
            total += 5.50;
        }
        if (size == 8)  {
            total += 7.00;
        }
        if (size == 12) {
            total += 8.50;
        }

        int meatCount   = 0;
        int cheeseCount = 0;


        for (Toppings toppings : toppingsList) {

            if (toppings instanceof Meat) {
                meatCount++;
                if (meatCount == 1) {
                    total += toppings.calculatePrice(size);
                } else {
                    switch (size) {
                        case 4: total += 0.50; break;
                        case 8: total += 1.00; break;
                        case 12: total += 1.50; break;
                    }
                }
            } else {
                total += toppings.calculatePrice(size);
            }

            if (toppings instanceof Cheese) {
                cheeseCount++;
                if (cheeseCount > 1) {
                    total += toppings.calculatePrice(size);
                } else {
                    switch (size) {
                        case 4: total += 0.30; break;
                        ca
                    }
                }
            }
        }

        return total;
    }
}
