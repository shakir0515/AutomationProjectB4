package day18_loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.println("Enter a string: ");
                String text = input.nextLine();

                int count = 0;

                while (text.contains("hi")) {
                    count++;
                    text = text.replaceFirst("hi", ""); // Remove the first occurrence of "hi"
                }

                System.out.println("The word 'hi' appears " + count + " times in the string.");
                input.close();



        // Find how many "hi" is in the word

        String word = "aaaahisvshihihihhhiivshisvadhisdvs";
        int count1 = 0;



        for (int i = 0; i < word.length() - 1 ; i++) {

            if (word.charAt(i) == 'h' && word.charAt(i+1) == 'i'){
                count1++;
            }

        }

        System.out.println("You got " + count1 + " times \"hi\" in \"" + word + "\"") ;

        //TODO: Home Practice: Try to do this code with the .substring() method





    }
}
