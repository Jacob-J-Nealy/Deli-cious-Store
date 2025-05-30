package com.pluralsight;

import com.pluralsight.orderItems.Chips;
import com.pluralsight.orderItems.CustomSandwich;
import com.pluralsight.orderItems.Drink;
import com.pluralsight.orderItems.customSandwichParts.Bread;
import com.pluralsight.orderItems.customSandwichParts.Toppings;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Cheese;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Meat;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.RegularToppings;
import com.pluralsight.orderItems.customSandwichParts.toppingsOptions.Sauce;

import java.util.*;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order order;

    public void uiHomeScreen() {

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
    public void uiNewOrderScreen() {
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
    private void uiSandwichSelection() {
        int drinkSelectInput;
        int sizeChoice = 0;
        Bread breadChoice = null;
        int toppingsChoice = 0;
        boolean isToasted = false;


        while (true) {

            // Sandwich Size Selection
            System.out.println("__________________________________________________");
            System.out.println("\n     ---Sandwich Size Selection Screen---");
            System.out.println("⬇️ Please Enter a Number from the Options Below ⬇️");
            System.out.println("\n|   4' Inch   |   8' Inch   |   12' Inch   |");
            System.out.print("Enter Number Here: ");

            boolean sizeSelecting = true;
            while (sizeSelecting) {
            try {
                sizeChoice = scanner.nextInt();
                scanner.nextLine(); // scanner eater

                switch (sizeChoice) {
                    case 4, 8, 12 -> {
                        System.out.println("✅ You Selected: " + sizeChoice + "' Inch Sandwich");
                        sizeSelecting = false;
                    }
                    default -> {
                        System.err.print("❌ Invalid Size. (Size Choices are 4', 8' or 12'): ");
                    }
                }
            } catch (Exception e) {
                System.err.print("Invalid Input. Enter a Number for Size Choice: ");
                scanner.nextLine();
            }
            }
            System.out.println("__________________________________________________");


            // Bread Selection Screen
            System.out.println("           ---Bread Selection Screen---           ");
            System.out.println("⬇️ Please Enter a Number from the Options Below ⬇️");
            System.out.println("\n|   1-White   |   2-Wheat   |   3-Rye   |   4-Wrap   |");
            System.out.print("Enter Here: ");

            boolean breadSelecting = true;
            while (breadSelecting) {
                try {
                    int typeChoice = scanner.nextInt();

                    scanner.nextLine(); // scanner eater
                    switch (typeChoice) {
                        case 1 -> breadChoice = new Bread("White");
                        case 2 -> breadChoice = new Bread("Wheat");
                        case 3 -> breadChoice = new Bread("Rye");
                        case 4 -> breadChoice = new Bread("Wrap");
                        default -> System.err.print("❌ Invalid Selection; Try Again: ");
                    }

                    if (typeChoice == 1 || typeChoice == 2 || typeChoice == 3 || typeChoice == 4) {
                        System.out.println("✅ You Selected: " + breadChoice + " Bread");
                        breadSelecting = false;
                    }
                } catch (Exception e) {
                    System.err.print("❌ Invalid Bread Choice. Please choose from corresponding Numbers above: ");
                    scanner.nextLine();
                }
            }
            System.out.println("__________________________________________________");


            // Sandwich Builder
            System.out.println("🥪 Welcome to the Sandwich Builder!");
            System.out.println("__________________________________________________");
            System.out.println("⬇️ Please Enter a Number from the Options Below To Add to Your Sandwich ⬇️");
            System.out.println();

            // Regular Toppings
            System.out.println("                         +++ Regular Toppings +++                                 |");
            System.out.println("|_________________________________________________________________________________|");
            System.out.println("   1 - Lettuce       |  2 - Bell Peppers  |  3 - Onions       |  4 - Tomatoes      ");
            System.out.println("   5 - Jalapenos     |  6 - Cucumbers     |  7 - Pickles      |  8 - Spinach       ");
            System.out.println("                     |   9 - Guacamole    | 10 - Mushrooms    |                                        ");
            System.out.println();

            // Meats
            System.out.println("                               +++ Meats +++                                      |");
            System.out.println("|      NOTE: Extra charge for more than one Meat (based on size)                  |");
            System.out.println("|_________________________________________________________________________________|");
            System.out.println("| 11 - Steak         | 12 - Ham           | 13 - Salami       | 14 - Roast Beef    ");
            System.out.println("                     | 15 - Chicken       | 16 - Bacon        |                    ");
            System.out.println();

            // Cheeses
            System.out.println("|                             +++ Cheeses +++                                     |");
            System.out.println("|      NOTE: Extra charge for more than one cheese (based on size)                |");
            System.out.println("|_________________________________________________________________________________|");
            System.out.println("  17 - American      | 18 - Provolone     | 19 - Cheddar      | 20 - Swiss         ");
            System.out.println();

            // Sauces
            System.out.println("|                              +++ Sauces +++                                     |");
            System.out.println("|_________________________________________________________________________________|");
            System.out.println("| 21 - Mayo          | 22 - Mustard       | 23 - Ketchup      | 24 - Ranch        |");
            System.out.println("                     | 25 - Thousand Isl. | 26 - Vinaigrette  |                                       |");

            boolean done = false;

            Map<Integer, Toppings> toppingsSelectionMap = new HashMap<>();

            // Regular Toppings
            toppingsSelectionMap.put(1,  new RegularToppings("Lettuce",      false));
            toppingsSelectionMap.put(2,  new RegularToppings("Bell Peppers", false));
            toppingsSelectionMap.put(3,  new RegularToppings("Onion",        false));
            toppingsSelectionMap.put(4,  new RegularToppings("Tomatoes",     false));
            toppingsSelectionMap.put(5,  new RegularToppings("Jalapenos",    false));
            toppingsSelectionMap.put(6,  new RegularToppings("Cucumbers",    false));
            toppingsSelectionMap.put(7,  new RegularToppings("Pickles",      false));
            toppingsSelectionMap.put(8,  new RegularToppings("Spinach",      false));
            toppingsSelectionMap.put(9, new RegularToppings("Guacamole",     false));
            toppingsSelectionMap.put(10, new RegularToppings("Mushrooms",    false));

            // Meat
            toppingsSelectionMap.put(11, new Meat("Steak",      true));
            toppingsSelectionMap.put(12, new Meat("Ham",        true));
            toppingsSelectionMap.put(13, new Meat("Salami",     true));
            toppingsSelectionMap.put(14, new Meat("Roast Beef", true));
            toppingsSelectionMap.put(15, new Meat("Chicken",    true));
            toppingsSelectionMap.put(16, new Meat("Bacon",      true));

            // Cheese
            toppingsSelectionMap.put(17, new Cheese("American Cheese",  true));
            toppingsSelectionMap.put(18, new Cheese("Provolone Cheese", true));
            toppingsSelectionMap.put(19, new Cheese("Cheddar Cheese",   true));
            toppingsSelectionMap.put(20, new Cheese("Swiss Cheese",     true));

            //Sauce
            toppingsSelectionMap.put(21, new Sauce("Mayo",            false));
            toppingsSelectionMap.put(22, new Sauce("Mustard",         false));
            toppingsSelectionMap.put(23, new Sauce("Ketchup",         false));
            toppingsSelectionMap.put(24, new Sauce("Ranch",           false));
            toppingsSelectionMap.put(25, new Sauce("Thousand Island", false));
            toppingsSelectionMap.put(26, new Sauce("Vinaigrette",     false));

            List<Toppings> toppingsList = new ArrayList<>();

            while (!done) {
                System.out.println("(Enter 0 when finished)");
                System.out.println();
                System.out.print("Enter Here: ");

                try {
                    toppingsChoice = scanner.nextInt();
                    scanner.nextLine(); // scanner eater
                } catch (Exception e) {
                    System.err.println("❌ Invalid Input. Please Enter from the Corresponding Numbers: ");
                    scanner.nextLine();
                }

                // toppingsList.add(toppingsChoice);
                if (toppingsChoice == 0) {
                    done = true;
                } else if (toppingsSelectionMap.containsKey(toppingsChoice)) {

                    Toppings toppings = toppingsSelectionMap.get(toppingsChoice);
                    toppingsList.add(toppings);
                    System.out.println("✅ Added: " + toppings.getName());

                } else {
                    System.err.println("❌ Invalid Input. Try Again.");
                }
            }
            System.out.println("__________________________________________________");

            // Is Sandwich Toasted?

            System.out.println("---Toasted?---");
            System.out.println("Y: yes");
            System.out.println("N: no");

            boolean toastedSelecting = true;
            System.out.print("Enter Here: ");
            while (toastedSelecting) {
                String toastedChoice = scanner.nextLine();
                System.out.println();


                isToasted = false;
                if (toastedChoice.equalsIgnoreCase("Y")) {
                    isToasted = true; toastedSelecting = false;
                } else if (toastedChoice.equalsIgnoreCase("N")) {
                    isToasted = false; toastedSelecting = false;
                } else {
                    System.err.print("Invalid Toasted Input. (Please Enter Y or N for yes or No): ");
                }
            }

            CustomSandwich sandwich = new CustomSandwich(sizeChoice, breadChoice, toppingsList, isToasted);
            double price = sandwich.calculatePrice();
            order.addItem(sandwich);
            System.out.println("Your Custom Sandwich: " + sandwich);
            System.out.println("🥪 Your Custom Sandwich was added to your order!");
            return;
        }
    }
    private void uiDrinkSelectionScreen() {
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
            }
            case 2 -> {
                System.out.println("You Selected: MEDIUM");
                size = "MEDIUM";
            }
            case 3 -> {
                System.out.println("You Selected: LARGE");
                size = "LARGE";
            }
            default -> {
                System.out.println("No Size Selected");
                break;
            }
        }

        Drink drink = new Drink(name, size);
        price = drink.calculatePrice();
        order.addItem(drink);
        System.out.println("Your Drink Selection: " + drink);

    }
    private void uiChipsSelection() {
        int chipsSelectInput;

        while (true) {
            System.out.println("🍟 Chips Selection Screen");
            System.out.println("_____________________________________________");
            System.out.println("Please Make Your Selection from the Off-Brand Chips Below: ");
            System.out.println("1) Fray Classic Chips ");
            System.out.println("2) Chorritos");
            System.out.println("3) Cheezos");
            System.out.println("4) Hot Cheezos");
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
        double price = 1.50;
        switch (chipsSelectInput) {
            case 1 -> name = "Fray Classic Chips";
            case 2 -> name = "Chorritos";
            case 3 -> name = "Cheezos";
            case 4 -> name = "Hot Cheezos";
            case 5 -> name = "Titos";
            case 6 -> name = "Sunrise Chips";
            default -> {
                System.err.println("Invalid Input");
                return;
            }
        }

        Chips chips = new Chips(name);
        order.addItem(chips);
        System.out.println("Your Chips Selection: " + chips);

    }
    private void uiCheckOut() {
        order.displayOrder();

        System.out.println("\nHow much would you like to Pay?");
        System.out.print("Enter Here: $");

        double payment = scanner.nextDouble();

        if (payment >= order.calculateTotal()) {
            System.out.println("Receipt");
            System.out.println("______________________");
            System.out.printf("Subtotal: $%.2f\n", order.calculateSubtotal());
            System.out.printf("Tax: " + order.calculateTax());
            System.out.printf("Total: " + order.calculateTotal());
        } else {
            System.err.println("Not Enough Moolah");
        }

    }


}




