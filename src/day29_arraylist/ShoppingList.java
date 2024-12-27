package day29_arraylist;

import java.util.*;
//import java.util.Scanner;

/*
    We will have one shopping list container
    We will check if certain items is in the shopping list
    We will ask user to add items in there
        If you wants to continue adding item, they can
    I will check to see what is the status of shopping list (empty or not)

 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();
        // size is 0
        // capacity is 10

        // check the status of the shopping list
        // Instead of writing this if else multiple times, I create a reusable method
        // statusOfShoppingList(shoppingList);


        String userAnswer = "";
        do {
            System.out.print("Please, enter item name to add to the list: ");
            String itemToAdd = key.nextLine();

            shoppingList.add(itemToAdd);


            System.out.print("Do you want to add more: (y/n) ");
            userAnswer = key.nextLine(); // y

        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")); //yes, YES, Yes | Y, y ---- >



        //Loop through and give me all the item names
        System.out.println("Shopping list has " + shoppingList.size() + " items in it.");
        for ( String eachItem : shoppingList) {
            System.out.println("\t" + eachItem);
        }

        statusOfShoppingList(shoppingList);



        // Ask a user what item user want to check if it is available in Shopping List
        System.out.print("What item do you want to check if available in shopping list: ");
        String itemName = key.nextLine();  // item name: Apple

        itemAvailableInShoppingList(shoppingList, itemName);


        System.out.println("---------------------------------------------------");


        // Ask user if they want to remove any item from the shopping list
        // Ask a user what item they want to remove from the shopping list
        System.out.print("Do you want to remove any item: ");
        //if (key.nextLine().equalsIgnoreCase("yes")){  // you can directly use it in the if condition as well.
        userAnswer = key.nextLine();
        if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")){

            System.out.print("What item do you want to remove: ");
            itemName = key.nextLine();  // "4"



            if (Character.isDigit( itemName.charAt(0)  )) {
                shoppingList.remove(  Integer.parseInt(itemName)  - 1 );  // "4" -- > 4 --- >  4-1 -- > 3
            } else {
                shoppingList.remove(itemName);
            }


        }

        System.out.println("Final List: " + shoppingList);



    }


    public static void statusOfShoppingList (ArrayList <String> list) {
//        if (list.isEmpty()) {
//            System.out.println("Shopping list is empty");
//        } else {
//            System.out.println("There are some items in the shopping list");
//        }
        System.out.println(  list.isEmpty() ?  "Shopping list is empty" :  "There are some items in the shopping list");

    }


    public static void itemAvailableInShoppingList (ArrayList <String> list, String itemName){
        if (list.contains(itemName)){
            System.out.println(itemName + " is on the shopping list" );
        } else {
            System.out.println(itemName + " is not on the shopping list");
        }
    }



}
