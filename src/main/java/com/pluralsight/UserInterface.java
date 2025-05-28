package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static Order order;

    public static void uiHomeScreen() {

        // Display HomeScreen
        int homeScreenInput = -1;
        System.out.println("\nWelcome to DEliiii-Cious Sandwich Shop!");
        System.out.println("Where we put the Deli in Delicious Sandwiches!");
        System.out.println("_____________________________________________");
        System.out.println("Please Choose an Option Below:\n");
        System.out.println("1) *New* Order");
        System.out.println("0) Exit Application");
        System.out.print("\nInput Here: ");
        homeScreenInput = scanner.nextInt();

        switch (homeScreenInput) {
            case 1:
                order = new Order();
                uiNewOrderScreen();
                break;
            case 0:
                System.out.println("_____________________________________________");
                System.out.println("Closing Application...");
                break;
            default:
                System.err.println("Incorrect Input. Try Again");
                break;
        }

    }
    public static void uiNewOrderScreen() {
        int newOrderInput = -1;
        boolean running = true;

        while (running) {

            // New Order Selection Screen Display & Input
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

            switch (newOrderInput) {
                case 1 -> uiSandwichSelection();
                case 2 -> uiDrinkSelectionScreen();
                case 3 -> uiChipsSelection();
                case 4 -> uiCheckOut();
                case 0 -> {
                    System.out.println("_____________________________________________");
                    System.out.println("Canceling Order...");
                    running = false;
                }
                default -> System.err.println("Incorrect Input. Returning to Home Screen...");
            }
        }
    }
    private static void uiDrinkSelectionScreen() {
        Scanner scanner = new Scanner(System.in);
        int drinkSelectInput;

        while (true) {
            System.out.println("🍺 Drink Selection Screen");
            System.out.println("_____________________________________________");
            System.out.println("Please Make Your Selection from the Off-Brand Options Below: ");
            System.out.println("1) Coca-Coola ");
            System.out.println("2) Diet Coca-Coola");
            System.out.println("3) Spryte");
            System.out.println("4) Orange Fanto");
            System.out.println("5) Bepsi");
            System.out.println("6) 77-UP");
            System.out.println("7) Valley Dew");
            System.out.println("8) Hour Maid");
            System.out.println("\n0) Go Back");
            System.out.print("\n Enter Here: ");
            drinkSelectInput = scanner.nextInt();
            scanner.nextLine(); // scanner eater
            System.out.println("_____________________________________________");

            if (drinkSelectInput == 0) {
                System.out.println("Going Back...");
                return;
            }

            if (drinkSelectInput < 1 || drinkSelectInput > 8) {
                System.err.println("Invalid Input. Please Try Again");
                continue;
            }
            break;
        }
        String name = null;
        switch (drinkSelectInput) {
            case 1 -> name = "Coca Coola";
            case 2 -> name = "Diet Coca Coola";
            case 3 -> name = "Spryte";
            case 4 -> name = "Orange Fanto";
            case 5 -> name = "Bepsi";
            case 6 -> name = "7-UP";
            case 7 -> name = "Valley Dew";
            case 8 -> name = "Hour Maid";
            default -> {
                System.err.println("Invalid Input");
                return;
            }
        }

        int drinkSizeInput;
        System.out.println("Please Select your Drink Size: ");
        System.out.println("1) Small Drink  - 2.00$");
        System.out.println("2) Medium Drink - 2.50$");
        System.out.println("3) Large Drink  - 3.00$");
        System.out.println("Enter Here: ");
        drinkSizeInput = scanner.nextInt();
        scanner.nextLine(); // scanner eater

        String size = null;
        double price = 0;
        switch (drinkSizeInput) {
            case 1 -> {
                System.out.println("You Selected: SMALL");
                size = "SMALL";
                price = 2.00;
            }
            case 2 -> {
                System.out.println("You Selected: MEDIUM");
                size = "MEDIUM";
                price = 2.50;
            }
            case 3 -> {
                System.out.println("You Selected: LARGE");
                size = "LARGE";
                price = 3.00;
            }
            default -> {
                System.out.println("No Size Selected");
                break;
            }
        }

        Drink drink = new Drink(name, price, size);
        order.addItem(drink);
        System.out.println("Your Drink Selection: " + drink);

    }

    private static void uiSandwichSelection() {

    }

    private static void uiChipsSelection() {
        Scanner scanner = new Scanner(System.in);
        int chipsSelectInput;

        while (true) {
            System.out.println("🍟 Chips Selection Screen");
            System.out.println("_____________________________________________");
            System.out.println("Please Make Your Selection from the Off-Brand Chips Below: ");
            System.out.println("1) Fray Classic Chips ");
            System.out.println("2) Chorritos");
            System.out.println("3) Cheezos");
            System.out.println("4) Orange Fanto");
            System.out.println("5) Titos");
            System.out.println("6) Sunrise Chips");
            System.out.println("\n0) Go Back");
            System.out.print("\n Enter Here: ");
            chipsSelectInput = scanner.nextInt();
            scanner.nextLine(); // scanner eater
            System.out.println("_____________________________________________");

            if (chipsSelectInput == 0) {
                System.out.println("Going Back...");
                return;
            }

            if (chipsSelectInput < 1 || chipsSelectInput > 6) {
                System.err.println("Invalid Input. Please Try Again");
                continue;
            }
            break;
        }
        String name = null;
        switch (chipsSelectInput) {
            case 1 -> name = "Fray Classic Chips";
            case 2 -> name = "Chorritos";
            case 3 -> name = "Spryte";
            case 4 -> name = "Cheezos";
            case 5 -> name = "Titos";
            case 6 -> name = "Sunrise Chips";
            default -> {
                System.err.println("Invalid Input");
                return;
            }
        }

        String size = null;
        double price = 0;
        switch (drinkSizeInput) {
            case 1 -> {
                System.out.println("You Selected: SMALL");
                size = "SMALL";
                price = 2.00;
            }
            case 2 -> {
                System.out.println("You Selected: MEDIUM");
                size = "MEDIUM";
                price = 2.50;
            }
            case 3 -> {
                System.out.println("You Selected: LARGE");
                size = "LARGE";
                price = 3.00;
            }
            default -> {
                System.out.println("No Size Selected");
                break;
            }
        }

        Drink drink = new Drink(name, price, size);
        order.addItem(drink);
        System.out.println("Your Drink Selection: " + drink);

    }

    private static void uiCheckOut() {
    }


}




