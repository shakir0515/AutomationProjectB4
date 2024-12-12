package day25_methods;

import my_utilities.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {

        int [] nums = {23, 345, 23, 1356, 765, 2344, 2, -78};
        System.out.println( minNumInArr(nums) );

        System.out.println(ArrayUtil.minNumInArr(nums));
    }

    // want to make custom method which find min number in int array and returns it to me.
    public static int minNumInArr (int [] arr){
        int min = 0;
        Arrays.sort(arr); // [2, 23, 23, 345, 765, 1356, 2344]

        min = arr[0];

        return min;
    }
}