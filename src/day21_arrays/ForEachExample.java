package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {


        int [] nums = {3, 4, 5};

        // OPTION 1 - with fori loop / traditional loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional loop: " + nums[i]);
        }

        System.out.println();
        // OPTION 2 - with foreach loop
        for (int eachElem : nums){
            System.out.println("Foreach loop: " + eachElem);
        }
        // you can ONLY start from beginning and go all the way to the last element
        // you can ONLY get/read - cannot reassign



        // FOREACH loop is not a good choice for re-assigning.
        System.out.println();
        String [] names = new String[4];
        for ( String each : names) {
            System.out.println(each);
            each = "Loopcamp"; // this will re-assign each variable but will not reassign in array
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = "Loopcamp";
        }
        System.out.println(Arrays.toString(names));


        System.out.println();
        double [] arr3 = {34, 28, 56, 87};
        for ( double each : arr3){
            System.out.println(each);
        }


        // FOREACH cannot start from middle - ALWAYS form first to last element
        System.out.println();
        char [] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        for (int i = letters.length/2 ; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        System.out.println();
        for ( char each : letters) {
            System.out.println(each);
        }



    }
}
