package day15_string;

import java.util.Scanner;  // Import Scanner class from util package
import java.util.*;  // * --- > everything. Import Everything form util package
/*
    NOTE: FINDS THE BIGGEST AND CHECK IF THE BIGGEST HAS "A" IN IT.
    NOTE: All three words have a
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
    // TODO: Improve the code
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter three words:");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();
        System.out.println("Enter the character to check for:");


        // 1st - needs to contain "a"
        //      word1.contains("a")
        // 2nd - needs to be longest
        //      word1.length() > word2.length() && word1.length() > word3.length();


        boolean isFirstLongestWithA = word1.contains("a") && (word1.length() > word2.length() && word1.length() > word3.length());
        boolean isSecondLongestWithA = word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.contains("a") && word3.length() > word1.length() && word3.length() > word2.length();

        // TODO: Improve the code - implement the option if the words to no have "a" in it. But if there word with "a" then print that one.
        //  HINT: nested if
        if (isFirstLongestWithA) {
            System.out.println(word1 + " is the longest with a");
        } else if (isSecondLongestWithA) {
            System.out.println(word2 + " is the longest with a");
        } else if (isThirdLongestWithA) {
            System.out.println(word3 + " is the longest with a");
        }

        //This way we are finding the words with "a" if no a the size is 0
        if (!word1.contains("a")) {
            word1 = "";
            int word1Length =  word1.length();  // 4
        }
        if (!word2.contains("a")) {
            word2 = ""; // mouse  --- 5 --- wordTwo --- > 0;
            int word2Length =  word2.length();   // 0
        }
        if (!word3.contains("a")){
            word3 ="";
            int word3Length =  word3.length(); // 0
        }


    }
}
