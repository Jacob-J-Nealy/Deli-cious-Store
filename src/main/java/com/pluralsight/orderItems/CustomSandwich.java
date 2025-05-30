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

        // String Builder Sandwich Builder
        StringBuilder sandwichBuilder = new StringBuilder();

        sandwichBuilder.append("Custom Sandwich ").append(size).append("'\n");
        sandwichBuilder.append(bread.getType()).append(" Bread | Toasted: ").append(isToasted).append("\n\n");

        sandwichBuilder.append("Toppings:\n");
        for (Toppings topping : toppingsList) {
            sandwichBuilder.append("- ").append(topping.getName()).append("\n");
        }

        sandwichBuilder.append("\nTotal: ").append(String.format("$%.2f", calculatePrice()));

        return sandwichBuilder.toString();
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
                        case 8: total += 0.60; break;
                        case 12: total += 0.90; break;
                    }
                }
            }
        }

        return total;
    }
}
