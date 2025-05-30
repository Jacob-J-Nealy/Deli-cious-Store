package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // Properties
    private List<Priceable> items = new ArrayList<>();

    // Order Methods
    public List<Priceable> getItems() {
        return items;
    }

    public void addItem(Priceable item) {
        items.add(item);
    }

    // Calculate Order Total Methods
    public double calculateSubtotal() {
        double total = 0;
        for (Priceable item : items) {
            total += item.calculatePrice();
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

    // Display Order Method
    public void displayOrder() {
        System.out.println("--------Your Order--------");

        int itemNumber = 1;
        for (Priceable item : items) {
            System.out.printf("Order Item %d:\n", itemNumber++);
            System.out.println(item);
            System.out.println("_________________________________________");
        }

        double subtotal = calculateSubtotal();
        double tax = calculateTax();
        double total = calculateTotal();

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax:      $%.2f\n", tax);
        System.out.printf("Total:    $%.2f\n", total);
    }



}
