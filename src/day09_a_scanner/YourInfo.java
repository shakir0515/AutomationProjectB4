package day09_a_scanner;
/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    and ask them to enter their favorite number (long),

    Print all the values from the inputs

 */

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        // Declared Scanner reference and assigned Scanner object to it
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your favorite book: ");
        String book = key.nextLine();
        // System.out.println(book);

        System.out.print("Please, enter you age: ");
        byte age = key.nextByte();

        System.out.print("Please, enter your favorite long number: ");
        long num = key.nextLong();

        System.out.println("\nInfo you entered: ");
        System.out.println("\t" + book);
        System.out.println("\t" + age);
        System.out.println("\t" + num);






    }
}