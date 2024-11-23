package day08_scanner_logical_operators;
/*
    create a Scanner object
    ask the user to enter 2 numbers
    check if the numbers are equal to each other
 */

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        //Scanner reference = create a Scanner object
        //Following line get the info from user/console
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter 2 numbers:");
        System.out.print("\tNumber 1: ");
        //int num1 = 34;
        int num1 = keyboard.nextInt();
        //System.out.println(num1);
        System.out.print("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        boolean areNumsEqual = num1 == num2;
        System.out.println("\n\tIs " + num1 + " equal to " + num2 + "? " + areNumsEqual);

    }
}
