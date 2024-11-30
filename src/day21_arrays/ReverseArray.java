package day21_arrays;

import java.util.Arrays;

/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 9};
        //            0  1  2  3  4


        // OPTION 1 - juts with print statement
        String result = "[";
        for (int i = arr.length-1; i >=0 ; i--) {
            result += arr[i] + ", ";
        }

        result = result.substring(0, result.length()-2) + "]";
        System.out.println(result);


        System.out.println();
        // OPTION 2 - create another array an store all elements from arr in a reversed order
        int [] reversed = new int[arr.length];


        //int [] arr = {1, 2, 3, 4, 5};
        //              0  1  2  3  4

        //int [] reversed = new int[arr.length];
        //              {_, _, _, _, _ }
        //               0  1  2  3  4


        // reversed[4] = arr[1];  | reversed[3] = arr[2];   |  reversed[2] = arr[2];  |  reversed[1] = arr[3];  | reversed[0] = arr[4];

        for (int i = 0; i < arr.length; i++) {
            reversed[reversed.length-1 - i ] = arr[i];
        }

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reversed: " + Arrays.toString(reversed));


        System.out.println();
        // This will do the same as above with different implementation
        //      initialization ;                condition;            iteration
        int [] reversed2 = new int[arr.length];
        for (int j = 0, i = arr.length - 1;       i >= 0;             i--, j++) {
            reversed2[j] = arr[i];
        }
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reversed2: " + Arrays.toString(reversed2));



    }
}
