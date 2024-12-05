package day21_arrays;
import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr1 = new double[4]; // Created an array with 4 memory locations.
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);


        System.out.println();
        // Let's assign values to those locations
        System.out.println( arr1[0]);
        arr1[0] = 30.99;
        System.out.println(Arrays.toString(arr1));


        System.out.println();
        double price = 20.99;
        int quantity = 5;

        System.out.println(arr1[arr1.length - 1]);
        arr1[arr1.length - 1] = price * quantity;
        System.out.println(Arrays.toString(arr1));

        // re-assign
        arr1[arr1.length - 1] = 10.99;
        System.out.println(Arrays.toString(arr1));


        System.out.println();
        arr1[1] = 45;
        System.out.println( Arrays.toString( arr1 ));

        System.out.println();
        //arr1[2] = false;  // cannot assign boolean into double


        System.out.println();
        // re-assign array
        arr1 = new double[5]; // created a NEW array with 5 location
        System.out.println( Arrays.toString(arr1) ); // [30.99, 45.0, 0.0, 10.99, 0.0]
        arr1 = new double[10];
        System.out.println( Arrays.toString(arr1));
        arr1[0] = 20;
        System.out.println( Arrays.toString(arr1));
        System.out.println(arr1.length);
        int arrLength = arr1.length;
        System.out.println(arrLength);


    }
}


