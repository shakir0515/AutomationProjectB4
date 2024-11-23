package day16_loops;

import java.util.Scanner;
/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */
        public class MoveFirst {
            public static void main(String[] args) {

                Scanner key = new Scanner(System.in);
                System.out.print("Please, enter a sentence: ");
                String sentence = key.nextLine(); // Python is a fun language

                // P1
                // NO - substring(index);
                // YES - substring(index1, index2);
                // sentence.substring(0, 4) ----- > sentence.substring(0, sentence.indexOf(" ") );
                // 4 --- > need to make it dynamically --- >find the index of first space
                // sentence.indexOf(" "); ---- > index of first space
                String part1 = sentence.substring(0, sentence.indexOf(" "));

                // P2
                // YES - substring(index);
                // sentence.substring( 6  ); --- >  sentence.substring( sentence.indexOf(" ") );
                // 6 --- > need to make it dynamically --- > index of first space
                // sentence.indexOf(" "); --- > index of first space
                // MAY BE - substring(index1, index2);
                // String part2 = sentence.substring( sentence.indexOf(" ") + 1); // It does the same thing as one below
                String part2 = sentence.substring(sentence.indexOf(" ")).trim();


                //System.out.println(part1);
                //System.out.println(part2);

                System.out.println(part2 + " " + part1);



        /*
            TODO: Home Practice
                Handle the case where user provides only single word as a sentence.
                If user provides single word -- > print the same word.

                Hint: .contains();
         */


            }
        }
