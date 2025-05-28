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

    public double calculateTotal() {
        double total = 0;
        for (Priceable item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        for (Priceable item : items) {
            System.out.println(item);
        }
        System.out.printf("Total: $%.2f", calculateTotal());
    }
}
