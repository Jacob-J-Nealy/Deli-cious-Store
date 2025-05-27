package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    private static boolean running;

    public static void uiHomeScreen() {
        boolean running = true;

        while (running) {

            // Display HomeScreen
            int input = UserInterface.uiHomeScreenDisplay();

            switch (input) {

                case 1:
                    System.out.println("Opening New Order Menu...");
                    uiNewOrderScreen();
                    break;
                case 0:
                    System.out.println("_____________________________________________");
                    System.out.println("Closing Application...");
                    running = false;
                    break;
                default:
                    System.err.println("Incorrect Input. Returning to Home Screen...");
                    break;
            }

        }
    }
    public static int  uiHomeScreenDisplay() {

        try {
            int input = -1;

            System.out.println("\nWelcome to DEliiii-Cious Sandwich Shop!");
            System.out.println("Where we put the Deli in Delicious Sandwiches!");
            System.out.println("_____________________________________________");
            System.out.println("Please Choose an Option Below:\n");

            System.out.println("1) *New* Order");
            System.out.println("0) Exit Application");

            System.out.print("\nInput Here: ");
            input = scanner.nextInt();

            return input;

        } catch (Exception e) {
            System.err.println("Incorrect Input. Closing Application...");
        }

        return 0;
    }

    public static void uiNewOrderScreen() {
        boolean running = true;

        while (running) {

            // Display HomeScreen
            int newOrderInput = UserInterface.uiNewOrderDisplay();

            switch (newOrderInput) {

                case 1:
                    System.out.println("Opening Add Sandwich Menu...");
                    break;
                case 2:
                    System.out.println("Opening Add Drinks Menu...");
                    break;
                case 3:
                    System.out.println("Opening Add Chips Menu...");
                    break;
                case 4:
                    System.out.println("Opening Checkout Screen");
                case 0:
                    System.out.println("_____________________________________________");
                    System.out.println("Canceling Order...");
                    running = false;
                    break;
                default:
                    System.err.println("Incorrect Input. Returning to Home Screen...");
                    break;
            }

        }





    }
    public static int uiNewOrderDisplay() {
        try {
            int newOrderInput = -1;

            System.out.println("\nNew Order Selection Screen");
            System.out.println("_____________________________________________");

            System.out.println("What would you like to add to your Order?");
            System.out.println("Choose an Option Below:\n");

            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("\n0) Cancel Order");

            System.out.print("\nInput Here: ");
            newOrderInput = scanner.nextInt();
            scanner.nextLine(); // scanner eater

            return newOrderInput;


        } catch (Exception e) {
            System.err.println("Incorrect Input");
        }

        return 0;
    }





}

