package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine(); // Java is a good coding language

        System.out.println(sentence.charAt(0)); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt(0)); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 74 (ASCII table number for J)
        System.out.println(sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 101 (ASCII table number for e)


/*
            TODO: get the last char and 2nd last char and check if they are same
                If they are - print "Double same chars at th end"
                If not - print "Last two chars are not same"
         */



    }
}