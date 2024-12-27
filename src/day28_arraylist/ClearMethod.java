package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        System.out.println( nums );
        System.out.println( nums.size() );
        System.out.println( nums.isEmpty() );
        System.out.println( nums.contains( 1 ));
        System.out.println( nums.contains( 20 ));

        System.out.println();
        //nums.add("20");
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println(nums);
        System.out.println( nums.size() );
        System.out.println( nums.isEmpty() );

        System.out.println();
        System.out.println("Clearing the ArrayList....");
        nums.clear();
        System.out.println(nums);
        System.out.println( nums.size() );
        System.out.println( nums.isEmpty());

    }
}