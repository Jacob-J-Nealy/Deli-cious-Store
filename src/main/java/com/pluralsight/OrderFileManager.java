package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderFileManager {

    private static final String ReceiptsDirectory = "receipts";

    public void printReceipt(Order order, double payment) {
        System.out.println("\nReceipt");
        System.out.println("______________________");
        System.out.printf("Subtotal:   $%.2f\n", order.calculateSubtotal());
        System.out.printf("Tax:        $%.2f\n", order.calculateTax());
        System.out.printf("Total:      $%.2f\n", order.calculateTotal());
        System.out.printf("Payment:    $%.2f\n", payment);
        System.out.printf("Change Due: $%.2f\n", payment - order.calculateTotal());

        saveReceiptToFile(order, payment);
    }

    private void saveReceiptToFile(Order order, double payment) {

        File directory = new File(ReceiptsDirectory);
        if (!directory.exists()) {
            directory.mkdir();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String filename = LocalDateTime.now().format(formatter) + ".txt";
        File receiptFile = new File(directory, filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
            writer.write("-------- Your Order --------\n\n");

            for (Priceable item : order.getItems()) {
                writer.write(item.toString() + "\n\n");
            }

            writer.write(String.format("Subtotal: $%.2f\n", order.calculateSubtotal()));
            writer.write(String.format("Tax (6%%): $%.2f\n", order.calculateTax()));
            writer.write(String.format("Total: $%.2f\n", order.calculateTotal()));
            writer.write(String.format("Payment: $%.2f\n", payment));
            writer.write(String.format("Change Due: $%.2f\n", payment - order.calculateTotal()));
        } catch (Exception e) {
            System.err.println("❌ Save File Failed ");
        }
    }
}
