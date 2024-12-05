package day19_nested_loops;

import java.util.Scanner;
/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter multi words sentence: ");
        String str = key.nextLine().trim().toLowerCase(); // Today is sUNDAY ---- > today is sunday
        String camelCase = "" + str.charAt(0);  // t


        // today is -- > length = 8
        // 01234567
        // Repetitive action
        //      - get the letter + check if one before is space
        //                 if it space, get the current letter and make it uppercase and concate
        //                 if it is not space, get the current one and concate as it is.

        // I don't need to start from 0
        for (int i = 1; i < str.length(); i++) {

            //you can use the substring, but here we need only single space to compare
            if (str.charAt(i-1) == ' '){
              camelCase += ("" + str.charAt(i)).toUpperCase();
            } else {
                camelCase += str.charAt(i);
            }
        }
        // today is sunday
        // 01234567890....

        camelCase = camelCase.replace(" ", "");
        System.out.println(camelCase);
        System.out.println(camelCase);

            /*
            TODO: Practice Task
                Implement this code with while loop
                    Hint: while loop condition - continue as long as there space
         */
/*
Scanner input = new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String str = input.nextLine().toLowerCase().trim();

        str = str.toLowerCase().trim();

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.charAt(i) == ' ') {
                str = str.substring(0, i) + (str.charAt(i + 1) + "").toUpperCase() + str.substring(i + 2);
            }
        }

        String camel = str.replace(" ", "");
        System.out.println(camel);
 */
    }
}
