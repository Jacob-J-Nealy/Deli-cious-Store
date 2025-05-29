package com.pluralsight.orderItems;

import com.pluralsight.Priceable;

public class Drink implements Priceable {

    // Properties
    private String name;
    private String size;

    //Constructor
    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {

        // String Builder Drink Builder
        StringBuilder drinkBuilder = new StringBuilder();
        drinkBuilder.append(size).append(" ");
        drinkBuilder.append(name).append(" ");
        drinkBuilder.append("-").append(" ");
        drinkBuilder.append(String.format("$%.2f", calculatePrice()));

        return drinkBuilder.toString();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        if(size.equalsIgnoreCase("SMALL")){
            return  2.00;
        }

        if (size.equalsIgnoreCase("MEDIUM")) {
           return  2.50;
        }

        if (size.equalsIgnoreCase("LARGE")) {
            return 3.00;
        }

        return 0;
    }
}
