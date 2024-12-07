package day23_multidimentional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] arr = {4, 55, 4, 10, -1, 30, 100, 150};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 100));
        System.out.println(Arrays.binarySearch(arr, 200));


        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 100));
        System.out.println(Arrays.binarySearch(arr, 120));

// if you have two similar numbers it will give you the first matched index
        System.out.println();
        // Can we write our own code to find the index of the element
        int[] arr2 = {4, 55, 4, 10, -1, 30, 100, 150};  // size 8
        //             0   1  2   3   4   5   6   7
        int num = -1000;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == num) {
                System.out.println("Your first match element index is: " + i);
                break;

            } else if ((i + 1) == arr2.length) {        // in if statement we run throuth all the indexes and no match found , we add one to next index and compare with length ,
                System.out.println("There is not match");
            }
// } else {
//                count++;
        }

//if ((count)==arr2.length){
        // System.out.println("There was no match); //
    }
}


