package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String []  str = {"java", "hello", "by", "ba", "Hi", "4", "$hi", "@hi", "3", "10"};

        // sort it
        // ORDER: special characters > numbers > some special characters > UPPER CASE > lowercase
        Arrays.sort(str);
        System.out.println("After sorting: " + Arrays.toString(str));


    }
}
