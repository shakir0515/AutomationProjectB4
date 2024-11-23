package day18_loops;

import java.util.Scanner;

/*
Reverse only second word [String, Loops]

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
    Ex:
    I love java

    Ouput:
    I evol java
 */
public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence = key.nextLine().trim(); // I love java
        int countSpace = 0;

        // How to make sure user gave us 3 words
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                countSpace++;
            }
        }

        if (countSpace >= 2) { // if there are at least 3 words

            // You love java
            // 0123456789
            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");
            String middle = sentence.substring(firstSpaceIndex + 1, lastSpaceIndex);
            String reverse = "";


            for (int i = middle.length()-1; i >= 0; i--) {  // love
                reverse += middle.charAt(i);
            }


            System.out.println(    sentence.substring(0, firstSpaceIndex) + " " + reverse + " " + sentence.substring(lastSpaceIndex+1));


        } else {
            System.out.println("Sentence has less than 3 words");
        }

        /*
            TODO: Home Practise: Improve this code
                As a user to enter a sentence with at least 3 words until user gives it to you.
         */


    }
}
