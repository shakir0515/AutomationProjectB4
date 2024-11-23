package day14_string;

import java.util.Scanner;

/*
    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */
public class FirstName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter you first name: ");
        String firstName = key.nextLine().trim(); // tom -->
        System.out.print("Please, enter you last name: ");
        String lastName = key.nextLine().trim();


        System.out.println("--------------------------------------");
        System.out.println("You full name before corrected: " + firstName + " " +  lastName);

        // tomJERRY ---- > Tom Jerry
        /*
            first char fo first name ---- > UPPER
                rest char of first name --- > lower
            first chat of last name ----- > UPPER
                rest char of the last name --- > lower
         */

        // tOM
        // 012
        //first char fo first name ---- > UPPER
        // ("" + firstName.charAt(0)).toUpperCase(); // ---- > T/t < ---- this can be used as well.
        String correctFirstName = firstName.substring(0, 1).toUpperCase()  + firstName.substring(1).toLowerCase();
        String correctedLastName = ("" + lastName.charAt(0)).toUpperCase() +  lastName.substring(1).toLowerCase();

        System.out.println();
        System.out.println("You full name after corrected: " + correctFirstName + " " + correctedLastName);



        /*
            Ask a user to give a full name
            Then ask a user
                Which od the following options you would like to do?
                    1. Make all UPPER case
                    2. Make all lower case
                    3. Make each word capitalized

                    You option: 1, 2, 3

                 Then print out what user gave you as full name in the option they selected
         */
    }
}