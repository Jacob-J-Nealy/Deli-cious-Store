package com.pluralsight;

public class Drink implements Priceable {

    // Properties
    private String name;
    private double price;
    private String size;

    //Constructor
    public Drink(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override //toString
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
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
            this.price = 2.00;
        }

        if (size.equalsIgnoreCase("MEDIUM")) {
            this.price = 2.50;
        }

        if (size.equalsIgnoreCase("LARGE")) {
            this.price = 3.00;
        }

        return 0;
    }
}
