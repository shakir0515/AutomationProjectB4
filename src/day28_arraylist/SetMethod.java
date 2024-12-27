package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100); // index 0
        nums.add(200); // index 1
        nums.add(300); // index 2
        nums.add(400); // index 3
        nums.add(500); // index 4
        System.out.println(nums);

        // .set(index, newValue); // this methods updated the value at the given index with the given newValue
        nums.set(1, 900);
        System.out.println(nums);

        //nums.set(5, 800); // IndexOutOfBoundsException
        //System.out.println(nums);


        // update the last element in arraylist
        // nums.set(4, 1000);
        nums.set( nums.size() - 1, 1000 ); // Dynamically, getting the last index.
        System.out.println(nums);


        System.out.println();
        ArrayList <String> strList = new ArrayList<>();
        strList.add("java");
        strList.add("api");
        strList.add("db");
        strList.add("ci/cd");
        strList.add("soft-skills");
        System.out.println(strList);
        strList.set( 2, "data base");
        System.out.println(strList);


    }
}
