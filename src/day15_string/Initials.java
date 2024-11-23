package day15_string;

import java.util.Scanner;
/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        //String firstName = input.next().toUpperCase(); // tom --- > TOM
        String firstName = input.next();
        System.out.println("Please, enter you last name: ");
        //String lastName = input.next().toUpperCase();
        String lastName = input.next();
        char firstCharOfFirstName = firstName.charAt(0);    //// TOM -- > 'T'
//char firstCharOfFirstName = firstName.toUpperCase().charAt(0);
        char firstCharOfLastName = lastName.charAt(0);

        System.out.println(("" + firstCharOfFirstName + firstCharOfLastName).toUpperCase());
    }
}
