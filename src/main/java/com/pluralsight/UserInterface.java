package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);


    public static int uiHomeScreen() {

            // Display HomeScreen
            int homeScreenInput = UserInterface.uiHomeScreenDisplay();

            switch (homeScreenInput) {

                case 1:
                    System.out.println("Opening New Order Menu...");
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
            return homeScreenInput;

    }
    public static int  uiHomeScreenDisplay() {

        try {
            int homeScreenInput = -1;

            System.out.println("\nWelcome to DEliiii-Cious Sandwich Shop!");
            System.out.println("Where we put the Deli in Delicious Sandwiches!");
            System.out.println("_____________________________________________");
            System.out.println("Please Choose an Option Below:\n");

            System.out.println("1) *New* Order");
            System.out.println("0) Exit Application");

            System.out.print("\nInput Here: ");
            homeScreenInput = scanner.nextInt();

            return homeScreenInput;

        } catch (Exception e) {
            System.err.println("Incorrect Input. Closing Application...");
        }

        return 0;
    }

    public static void uiNewOrderScreen() {
        boolean running = true;

        while (running) {

            // Display HomeScreen
            try {
                int newOrderInput = UserInterface.uiNewOrderDisplay();

                switch (newOrderInput) {

                    case 1:
                        System.out.println("Opening Add Sandwich Menu...");
                        break;
                    case 2:
                        int choice = uiDrinkSelectionDisplay();
                        String name;

                        switch (choice) {
                            case 0:
                                System.out.println("Going Back...");
                                break;
                            case 1:
                                name = "Coca Coola";
                                System.out.println("You selected: Coca Cola- I MEAN Coca Coola");
                                break;
                            case 2:
                                System.out.println("You selected: Diet Coca-Cola- I MEAN Coca Coola");
                            case 3:
                                name = "Spryte";
                                System.out.println("You selected: Sprite- I MEAN Spryte");
                                break;
                            case 4:
                                name = "Orange Fanto";
                                System.out.println("You selected: Orange Fanta- I MEAN Orange Fanto");
                                break;
                            case 5:
                                name = "Bepsi";
                                System.out.println("You selected: Pepsi- I MEAN Bepsi");
                                break;
                            case 6:
                                name = "7-UP";
                                System.out.println("You selected: 7-UP- I MEAN 77-UP");
                                break;
                            case 7:
                                name = "Valley Dew";
                                System.out.println("You selected: Mountain Dew- I MEAN Valley Dew");
                                break;
                            case 8:
                                name = "Hour Maid";
                                System.out.println("You selected: Minute Maid- I MEAN Hour Maid");
                                break;
                            default:
                                System.err.println("Invalid Input");
                                break;
                        }

                        System.out.println("Please Select your Drink Size: ");
                        System.out.println("Small Drink  - 2.00$");
                        System.out.println("Medium Drink - 2.50$");
                        System.out.println("Large Drink  - 3.00$");

                        switch ()







                        break;
                    case 3:
                        System.out.println("Opening Add Chips Menu...");
                        break;
                    case 4:
                        System.out.println("Opening Checkout Screen");
                        break;
                    case 0:
                        System.out.println("_____________________________________________");
                        System.out.println("Canceling Order...");
                        running = false;
                        break;
                    default:
                        System.err.println("Incorrect Input. Returning to Home Screen...");
                        break;
                }

            } catch (Exception e) {
                System.err.println("Invalid bro...");
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

    public static void uiDrinkSelectionScreen() {

    }
    public static int uiDrinkSelectionDisplay() {
        int choice;

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
        choice = scanner.nextInt();
        System.out.println("_____________________________________________");

        return choice;
    }





}

