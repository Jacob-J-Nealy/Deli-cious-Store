package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // Properties
    private List<Priceable> items = new ArrayList<>();


    // Custom Methods



    public void addItem(Priceable item) {
        items.add(item);
    }

    public double calculateSubtotal() {
        double total = 0;
        for (Priceable item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public double calculateTax() {
        double tax = calculateSubtotal() * 0.06;

        return tax;
    }
    public double calculateTotal() {
        double total = calculateSubtotal() + calculateTax();

        return total;
    }

    public void displayOrder() {
        System.out.println("--------Your Order--------");
        for (Priceable item : items) {
            System.out.println(item);
        }
        System.out.printf("Total: $%.2f", calculateSubtotal());
    }



}
