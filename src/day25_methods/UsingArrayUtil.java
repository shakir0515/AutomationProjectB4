package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int [] nums = {234, 23, 76, 6, 34, 765, 34};
        System.out.println(ArrayUtil.minNumInArr(nums));

        System.out.println(ArrayUtil.maxNumInArr(nums));

        System.out.println( ArrayUtil.contains(nums, 6)  );
        System.out.println( ArrayUtil.contains(nums, 60)  );

        if (ArrayUtil.contains(nums, 80)) {
            System.out.println("Array contains that number");
        } else {
            System.out.println("Array does not contain that number");
        }
    }
}