/***************************************************************************************************************
 * Solution to the Fruit Stand Problem                                                                         *
 * Created by Emil on 2025-07-14                                                                               *
 * This program simulates a fruit and drink stand where users can choose items and see their total price.      *
 * It uses a while loop to handle user input and control flow to determine the item choices and their prices.  *
 * The program continues to prompt the user until they choose to quit or make a valid selection.               *
 * It also handles invalid inputs gracefully.                                                                  *
 ***************************************************************************************************************/

import java.util.Scanner;

public class FruitStand {
    public static void main(String[] args) {
        int totalPrice = 0; // Initialize total price to 0
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        // While loop so that when the user gives an invalid option the program doesn't terminate
        while (true) {
            String choice = sc.nextLine().trim(); // Read user input for item type and trim any leading or trailing whitespace
            if (choice.equalsIgnoreCase("fruit")) {
                System.out.println("Please choose a fruit: Strawberry, Banana, Apple, Mango (or type 'quit' to finsih your order)");
                String choice2 = "";
                while (!choice2.equals("quit")) {
                    choice2 = sc.nextLine().trim(); // Read user input and trim any leading or trailing whitespace
                    // Control flow block to determine the drink choice and its price
                    if (choice2.equalsIgnoreCase("strawberry")) {
                        System.out.println("You chose Strawberry, that will be $20");
                        totalPrice += 20;
                    } else if (choice2.equalsIgnoreCase("banana")) {
                        System.out.println("You chose Banana, that will be $30");
                        totalPrice += 30;
                    } else if (choice2.equalsIgnoreCase("apple")) {
                        System.out.println("You chose Apple, that will be $500");
                        totalPrice += 500;
                    } else if (choice2.equalsIgnoreCase("mango")) {
                        System.out.println("You chose Mango, that will be $10");
                        totalPrice += 10;
                    } else if (!choice2.equalsIgnoreCase("quit")) {
                        System.out.println("Invalid fruit choice");
                    }
                }
                System.out.println("Total price for fruits: $" + totalPrice);
                System.out.println("Thank you for your purchase!");
                break;
            }
            else if (choice.equalsIgnoreCase("drink")) {
                System.out.println("Please choose a drink: Water, Juice, Soda, Tea (or type 'quit' to finish your order)");
                String choice2 = "";
                while (!choice2.equals("quit")) {
                    choice2 = sc.nextLine().trim(); // Read user input and trim any leading or trailing whitespace
                    // Control flow block to determine the drink choice and its price
                    if (choice2.equalsIgnoreCase("water")) {
                        System.out.println("You chose Water, that will be $5");
                        totalPrice += 5;
                    } else if (choice2.equalsIgnoreCase("juice")) {
                        System.out.println("You chose Juice, that will be $15");
                        totalPrice += 15;
                    } else if (choice2.equalsIgnoreCase("soda")) {
                        System.out.println("You chose Soda, that will be $25");
                        totalPrice += 25;
                    } else if (choice2.equalsIgnoreCase("tea")) {
                        System.out.println("You chose Tea, that will be $10");
                        totalPrice += 10;
                    } else if (!choice2.equalsIgnoreCase("quit")) {
                        System.out.println("Invalid drink choice");
                    }
                }
                System.out.println("Total price for fruits: $" + totalPrice);
                System.out.println("Thank you for your purchase!");
                break;
            }
            System.out.println("Invalid choice, please enter 'fruit' or 'drink'");
        }
        sc.close();
    }
}