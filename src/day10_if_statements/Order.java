package day10_if_statements;

import java.util.Scanner;

/*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$fullName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
public class Order {
    public static void main(String[] args) {
        // Object Reference = object (parameters)
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter product name: ");
        String product = key.nextLine();

        System.out.print("Please, enter the price $");
        double price = key.nextDouble();

        System.out.print("Please, enter the quantity: ");
        int num = key.nextInt();

        // If there is any other than nextLine scanner method before nextLine method, we need to handle it with an extra empty nextLine method.
        key.nextLine();

        System.out.print("Please, enter your full name: ");
        String fullName = key.nextLine();

        String orderDetails = fullName + ", your order for " + num + " " + product + " has been placed. Your total is $" + (price * num);

        System.out.println(orderDetails);


    }
}