package com.pluralsight.orderItems.customSandwichParts;

public abstract class Toppings {

    // Toppings Properties
    private String name;
    private boolean isPremium;

    // Toppings Constructor
    public Toppings(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    // Toppings toString
    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
