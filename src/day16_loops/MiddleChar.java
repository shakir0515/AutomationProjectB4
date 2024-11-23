package day16_loops;
/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
        Ex:
            Input: elephant -- > 8
            //     01234567
            Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {
        //   COUNT     1234567   -- >  8, mid1 = 8/2 = 4 - 1 = 3, mid2 = 8/2 = 4  ||||||||   -- > 7, mid = 7/2 = 3
        String word = "elephan";
        //   INDEX     01234567
        String mid = "";

        // find mid char/s
        // if length is even ------- > if (word.length() % 2 == 0) {  }
        // take mid 2 chars
        // if length is odd  ------- > if (word.length()  % 2 != 0) { }
        // take mid 1 char


        if (word.length() % 2 == 0) {
            // mid1 = 8/2 = 4 - 1 = 3, mid2 = 8/2 = 4
            mid = word.substring(  word.length()/2 - 1,  word.length()/2 + 1);
            // mid = "" + word.charAt( word.length()/2 - 1) + word.charAt( word.length()/2  ); // this will do the same thing as one above
        } else {
            // mid = word.substring(  word.length()/2,  word.length()/2 + 1);  // This will do the same thing as one below
            mid = "" + word.charAt( word.length()/2 ); // this will do the same thing
        }


        System.out.println(mid);


    }
}

