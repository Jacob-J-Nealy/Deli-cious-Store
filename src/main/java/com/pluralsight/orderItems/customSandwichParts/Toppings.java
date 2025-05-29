package com.pluralsight.orderItems.customSandwichParts;

public abstract class Toppings {

    // Toppings Properties
    private String name;
    private boolean isPremium;
    private boolean isCheese;
    private boolean isMeat;

    public Toppings(String name, boolean isPremium, boolean isCheese, boolean isMeat) {
        this.name = name;
        this.isPremium = isPremium;
        this.isCheese = isCheese;
        this.isMeat = isMeat;
    }

    // Toppings Constructor
    public Toppings(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    // Toppings toString (Fix This Later)
    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }

    //Custom Methods

    public abstract double calculatePrice(int size);


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
