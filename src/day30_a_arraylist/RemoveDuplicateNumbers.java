package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.

    @param nums - The given ArrayList of numbers @return - ArrayList of numbers

        Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
 */
public class RemoveDuplicateNumbers {

    public static ArrayList <Integer> uniqueList2 (ArrayList <Integer> nums) {
        ArrayList <Integer> uniqueList2 = new ArrayList<>(); //[1, 3, 5, 1, 4, 5, 9]

        for ( Integer each : nums){
            if (Collections.frequency(nums, each) == 1){
                uniqueList2.add(each);
            }
        }
        return uniqueList2;
    }


    public static ArrayList <Integer> uniqueList (ArrayList <Integer> nums) { //[1, 3, 5, 1, 4, 5, 9]
        ArrayList <Integer> uniqueList = new ArrayList<>(nums); //[1, 3, 5, 1, 4, 5, 9]
        uniqueList.removeIf( each -> Collections.frequency(nums, each) > 1); // 2 > 1 | --- > [3, 5, 1, 4, 5, 9]
        // NOTE: We can use  Collections.frequency(uniqueList, each) > 1 INSTEAD OF Collections.frequency(nums, each) > 1). Looks like it is removing all matched ones.


       /*
           [1, 3, 5, 1, 4, 5, 9]

           1st
            1 --- > [1, 3, 5, 1, 4, 5, 9] --- > 2 > 1 --- > remove ---  > [3, 5, 1, 4, 5, 9]

           2nd
            3  -- > [1, 3, 5, 1, 4, 5, 9] -- > 1 > 1 ---- > remove X---  > [3, 5, 1, 4, 5, 9]

           3rd
            5 --- > [1, 3, 5, 1, 4, 5, 9]  - > 2 > 1 ---- > remove ---  > [3, 1, 4, 5, 9]


           4th
            1 --- >  [1, 3, 5, 1, 4, 5, 9] - > 2 > 1 ----- >  remove -- > [3, 4, 5, 9]

           5th
            4 --- > [1, 3, 5, 1, 4, 5, 9]  - > 1 > 1 ------> remove X -- > [3, 4, 5, 9]

           6th
            5 --- >  [1, 3, 5, 1, 4, 5, 9] - > 2 > 1 ------> remove ---- > [3, 4, 9]

           7th
            9 --- > [1, 3, 5, 1, 4, 5, 9] -- > 1 > 1 ------ > remove X -- > [3, 4, 9]

        */


        return uniqueList;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList( 1, 3, 5, 1, 4, 5, 9));
        System.out.println("Original: " + nums);

        System.out.println("Unique: " + uniqueList(nums));
        System.out.println("Unique2: " + uniqueList2(nums));
    }

}