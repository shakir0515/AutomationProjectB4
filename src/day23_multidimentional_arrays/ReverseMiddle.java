package day23_multidimentional_arrays;
/*
    Have a sentence with 3 words
    reverse the middle word

    ex:
        java always fun

        output:
            java syawla fun
 */
public class ReverseMiddle {
    public static void main(String[] args) {

        String sentence = "java always fun";

        // Option1 - .substring(index1space+1, index2ndspace) --- > find the index of 1st space and last space
        // Option2 - .split() --- > get the element at the index 1

        String [] arr = sentence.split(" ");
        String middle = arr[1]; // always
        String midReversed = "";

        // Option1 - reverse using .charAt() starting from end of the string
        // Option2 - reverse using .toCharArray()
        char [] letters = middle.toCharArray(); //  ['a', 'l', 'w', 'a', 'y', 's'] --> converting array to string

        for (int i = letters.length-1; i >= 0; i--) {

            midReversed += letters[i];

        }

        System.out.println(midReversed);
        System.out.println(arr[0] + " " + midReversed + " " + arr[2]);


    }
}