package day23_multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter the size of arr: ");
        int sizeArr1 = key.nextInt(); // 6
        int[] arr1 = new int[sizeArr1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Please enter value for index " + i + ": ");

            // int eachValue = key.nextInt();
            // arr1[i] = eachValue;

            arr1[i] = key.nextInt();
        }

        System.out.println(Arrays.toString(arr1));


        System.out.print("Please, enter how many additional elements you want to add into array: ");
        int additionalSize = key.nextInt(); // 2

        int[] arr2 = Arrays.copyOf(arr1, arr1.length + additionalSize);

        System.out.println(Arrays.toString(arr2));


        for (int i = arr1.length; i < arr2.length; i++) {  // 6 + 2
            System.out.print("Please, enter a value for index " + i + ": ");
            arr2[i] = key.nextInt();
        }

        System.out.println(Arrays.toString(arr2));
    }
}