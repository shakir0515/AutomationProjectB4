package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Remove Bad Pairs
        Create a method that will accept an Integer ArrayList and check for bad pairs. A pair is an element and the element next to it.
        A bad pair is whenever the first number in the pair is bigger then the second number. Remove any bad pairs for the ArrayList and return the ArrayList with no bad pairs
        Note: The given ArrayList will always be an even number of elements, so each number always has one pair
        @param nums - Given ArrayList of numbers @return - ArrayList of numbers
 */
public class RemoveBadPairs {
    public static ArrayList <Integer> keepGoodPair (ArrayList <Integer> list) { // [3, 5, 2, 64, 23, 23 ,23, 64]
        // bad pair --- > i > i+1
        // good pair -- > i <= i+1

        ArrayList <Integer> goodPair = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) <= list.get(i+1)) {
                goodPair.add(list.get(i));
                goodPair.add(list.get(i+1));
            }
        }

        return goodPair;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList( 30, 5, 2, 64, 23, 23 ,230, 64));
        System.out.println("Original: " + nums);


        System.out.println("Good Pairs: " + keepGoodPair(nums));


        ArrayList <Integer> nums2 = new ArrayList<>(Arrays.asList( 3, 5, 2, 64, 23, 23 ,23, 64));
//        Option 1 - This for each loop will give an exception because it is looking to loop through all the elements when the loops started
//        ConcurrentModificationException
//        for ( Integer each : nums2) {
//            if (each < 10){
//                nums2.remove(each);
//            }
//        }
//        System.out.println(nums2);

//        Option 2 - This fori loop with remove will skip some elements since size changes and index is keep going on
//        for (int i = 0; i < nums2.size(); i++) {
//            if (nums2.get(i) < 10){
//                nums2.remove(nums2.get(i));
//            }
//        }
//        System.out.println(nums2);

        // [3, 5, 2, 64, 23, 23, 23, 64]
        //  0  1  2   3   4   5   6  7

        //[5, 2, 64, 23, 23, 23, 64]
        // 0  1   2   3  4   5   6

    }


}