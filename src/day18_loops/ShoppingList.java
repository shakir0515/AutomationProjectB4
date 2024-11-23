package day18_loops;

import java.util.Scanner;
/*
    repeated actions
        -ask the user to enter the item
        -add item to the shopping list
        -ask user if they want to add more items.

    At the end show the whole item list
 */
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String userItem = "";
        String shoppingList = "Your Shopping Lst Items: ";
        String userAnswer = "";


        do {

            System.out.print ("Please, enter the name of the item? ");
            // userItem = scanner.nextLine(); // Banana
            // shoppingList += userItem;
            shoppingList = shoppingList + "\n\t" + scanner.nextLine(); // Banana


            System.out.print("Do you want to add more item (yes/no): ");
            userAnswer = scanner.nextLine(); // YES

        } while (userAnswer.equalsIgnoreCase("yes")); // as long as user says yes, I want to continue  ---- as long as user does NOT say no --- > userAnswer != no  ****   userAnswer == yes


        System.out.println(shoppingList);





    }
}
