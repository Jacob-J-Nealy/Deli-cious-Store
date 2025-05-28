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

        // New Order Selection Screen Display
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

        boolean running = true;

        while (running) {

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
        System.out.println("_____________________________________________");

        String name = null;
        switch (drinkSelectInput) {
            case 0 ->                           System.out.println("Going Back...");
            case 1 -> {name = "Coca Coola";     System.out.println("You selected: Coca Cola- I MEAN Coca Coola");}
            case 2 -> {name = "Diet Coca Coola";System.out.println("You selected: Diet Coca-Cola- I MEAN Coca Coola");}
            case 3 -> {name = "Spryte";         System.out.println("You selected: Sprite- I MEAN Spryte");}
            case 4 -> {name = "Orange Fanto";   System.out.println("You selected: Orange Fanta- I MEAN Orange Fanto");}
            case 5 -> {name = "Bepsi";          System.out.println("You selected: Pepsi- I MEAN Bepsi");}
            case 6 -> {name = "7-UP";           System.out.println("You selected: 7-UP- I MEAN 77-UP");}
            case 7 -> {name = "Valley Dew";     System.out.println("You selected: Mountain Dew- I MEAN Valley Dew");}
            case 8 -> {name = "Hour Maid";      System.out.println("You selected: Minute Maid- I MEAN Hour Maid");}
            default ->                          System.err.println("Invalid Input");
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
            case 1 -> {System.out.println("You Selected: SMALL"); size = "SMALL";price = 2.00;}
            case 2 -> {System.out.println("You Selected: MEDIUM");size = "MEDIUM";price = 2.50;}
            case 3 -> {System.out.println("You Selected: LARGE"); size = "LARGE";price = 3.00;}
            default ->{System.out.println("No Size Selected");break;}
        }

        Drink drink = new Drink(name, price, size);
        order.addItem(drink);
        System.out.println("Your Drink Selection: " + drink);

    }
    private static void uiSandwichSelection() {

    }
    private static void uiChipsSelection() {

    }
    private static void uiCheckOut() {

    }
}



