package day25_methods;
import my_utilities.StringUtil;

import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {
        // apple --- ale
        // Here we called the reusable method from tje same file (UniqueCharacters class)
        System.out.println(uniqueCharacters("apple"));

        // Here we called the reusable method from StringUtil class
        System.out.println( uniqueCharacters("Loopcamp") );

    }


    public static String uniqueCharacters (String str) {
        String unique =  "";

        for (int i = 0; i <str.length(); i++) {

            char eachChar = str.charAt(i);


            if (StringUtil.frequencyOfLetters(str, eachChar)== 1){
                unique += eachChar;
            }

        }


        return unique;
    }
}