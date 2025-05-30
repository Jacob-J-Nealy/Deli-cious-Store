package com.pluralsight;

import java.util.Scanner;

public class OrderFileManager {

    private void printReceipt() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        boolean paying = true;

        while (paying) {

            double payment = scanner.nextDouble();
            if (payment >= order.calculateTotal()) {
                System.out.println("Receipt");
                System.out.println("______________________");
                System.out.printf("Subtotal:   $%.2f\n", order.calculateSubtotal());
                System.out.printf("Tax:        $%.2f\n", order.calculateTax());
                System.out.printf("Total:      $%.2f\n", order.calculateTotal());
                System.out.printf("Payment:    $%.2f\n", payment);
                System.out.printf("Change Due: $%.2f\n", payment - order.calculateTotal());
                paying = false;
            } else {
                System.err.print("Not Enough Moolah. Try Again: ");
            }

        }
    }
}
