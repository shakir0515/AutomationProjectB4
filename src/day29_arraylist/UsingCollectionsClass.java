package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        // Collections ---- > 's' at the end


        ArrayList <Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(4, 2, 87, 23, 76, 11));
        System.out.println("Before sort: " + numList);

        // .sort()
        Collections.sort(numList);  // sorts in ASCENDING order
        System.out.println("After sort: " + numList);


        // .reverse()
        Collections.reverse(numList);
        System.out.println("After reverse: " + numList);



        System.out.println("--------------------------------");
        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('C', 'Z', 'K', 'A'));
        System.out.println("Original: " + letters);
        Collections.reverse(letters);
        System.out.println("Reversed: " + letters);
        Collections.sort(letters);
        System.out.println("Sorted: " + letters);


        System.out.println("--------------------------------");
        // .max() and .min()
        System.out.println( Collections.max(numList) );
        System.out.println( Collections.min(numList) );


        System.out.println("--------------------------------");
        letters.set(0, 'L');
        System.out.println(".set(): " + letters);
        Collections.swap(letters, 1, 3);
        System.out.println(".swap(): " + letters);
        // Collections.swap(letters, 1, 6);  // IndexOutOfBoundsException -- > index 6 is out of bond
        // System.out.println(".swap(): " + letters);
        //[L, Z, K, C] --- >  index 0 swap with index 3 in letters arraylist
        // 0  1  2  3
        Collections.swap(letters, 0, 3);
        System.out.println(".swap(): " + letters);


    }
}