package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeliUserInterface {
    private final String[] regularToppings = {"lettuce", "peppers", "onions", "tomatoes",
            "jalepenos", "cucumbers", "pickles", "guacamole",
            "mushrooms"};
    private final String[] meats = {"steak", "ham", "salami", "roast beef", "chicken", "bacon"};
    private final String[] cheeses = {"american", "provolone", "cheddar", "swiss"};
    private final String[] condiments = {"mayo", "mustard", "ketchup", "ranch", "thousand island", "vinaigrette"};
    private final String[] sauce = {"au jus", "sauce"};
    private Scanner scanner = new Scanner(System.in);


    //this methods is specifically creating a sandwich to
    // to add to an order

    public Sandwich addSandwich() {

        Sandwich newSandwich = new Sandwich();
//  user select size
        System.out.println("\nSelect sandwich size:");
        System.out.println("1. 4 in");
        System.out.println("2. 8 in");
        System.out.println("3. 12 in");
        System.out.print("Enter the number of your choice: ");

        int sizeChoice = scanner.nextInt();

        String size;
        switch (sizeChoice) {
            case 1:
                newSandwich.setSize(4);
                break;
            case 2:
                newSandwich.setSize(8);
                break;
            case 3:
                newSandwich.setSize(12);
                break;
            default:
                size = "Unknown";
                System.out.println("Invalid choice. Defaulting to Medium size.");
        }

        // Needs refactoring
        System.out.println("Select bread");
        System.out.println("1- White");
        System.out.println("2- Wrap");
        System.out.println("3- Wheat");
        System.out.println("5- Rye");
        System.out.println("7- Exit Menu)");
        System.out.println("0- Quit");

        System.out.print("Please choose an option: ");

        int mainMenuCommand = scanner.nextInt();
        //user selected bread
        //switch allows us to choose options
        switch (mainMenuCommand) {
            case 1:
                newSandwich.setBread("White");
                break;
            case 2:
                newSandwich.setBread("Wheat");
                break;
            case 3:
                newSandwich.setBread("Wrap");
                break;
            case 4:
                newSandwich.setBread("Rye");
                break;
            case 7:
            case 0:
            default:
                newSandwich.setBread("White");
                System.out.println("Invalid choice. Defaulting to White bread.");
        }
        System.out.println("Select Meat");
        System.out.println("Extra meat available at additional cost");
        //ist for displaying purposes
        for (int i = 0; i < meats.length; i++) {
            System.out.println((i + 1) + " " + meats[i]);
        }

        System.out.println("Please select all options that apply");

        Integer selection = scanner.nextInt();

        // the best way to retrieve multiple toppings.
        // from readline to add to arrays on Sandwich class
        System.out.println(selection);
        String selectionString = selection.toString();
        String[] selectionArray = selectionString.split("");

        ArrayList<String> meatArray = new ArrayList<>();

        for (String index : selectionArray) {
            meatArray.add(meats[Integer.parseInt(index) - 1]);
        }

        newSandwich.setMeats(meatArray);
//        System.out.println(newSandwich.getMeats());
///       for now we just want to display the meant choice


        System.out.println("Select cheese");
        System.out.println("Extra cheese available at additional cost");
        for (int i = 0; i < cheeses.length; i++) {
            System.out.println((i + 1) + " " + cheeses[i]);
        }
        System.out.println("Please select all options that apply");
        Integer cheeseSelection = scanner.nextInt();
//
//        System.out.println(selection);
//        String cheeseSelectionString = selection.toString();
//        String[] cheeseSelectionArray = selectionString.split("");
//
//        ArrayList<String> cheeseArray = new ArrayList<>();
//
//        for(String index: selectionArray) {
//            String[] cheese;
//            meatArray.add(cheese[Integer.parseInt(index) - 1]);
//
//
//            newSandwich.setCheeses(cheeseArray);
//       System.out.println(newSandwich.getCheese());
//
//        }
//
//
//        /// for now we just want to display the meant choice
//        return newSandwich;

//    public void orderScreen(){
//
//        System.out.println("1.Add Sandwich");
//   System.out.println("2.Add Drink");
//   System.out.println("3.Add Chips");
//    System.out.println("4.Checkout");
//    System.out.println("5.Cancel Order");
//
//    int selection = scanner.nextInt();
        switch (cheeseSelection) {
            case 1:
                System.out.println(addSandwich().toString());
            case 2:
                System.out.println("Add Drink");
            case 3:
                System.out.println("Add Chips");
            case 4:
                System.out.println("Checkout");
        }

        return newSandwich;
    }
}