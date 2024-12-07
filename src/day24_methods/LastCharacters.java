package day24_methods;

import java.util.Arrays;

/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters {
    public static void main(String[] args) {
        String[][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        System.out.println(Arrays.deepToString(words));

        for (String[] eachSingleArr : words) {
            String lastChars = "";
            for (String eachElement : eachSingleArr) {
                lastChars += eachElement.charAt(eachElement.length() - 1);
            }
            System.out.println(lastChars);

        }
         /*
            TODO: Practice
                Implement the same code with traditional loop: fori
         */

    }
}
