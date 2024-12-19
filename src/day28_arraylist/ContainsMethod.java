package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        // isEmpty() --- >  returns boolean -- > true if empty otherwise false if there is an element
        System.out.println( nums.isEmpty() );
        boolean resut = nums.isEmpty();
        System.out.println(resut);

        System.out.println();
        nums.add(100);
        System.out.println( nums.isEmpty() );
        //nums.add("200");
        //nums.add(Integer.parseInt("200")); // Integer.parseInt("200") -- > int 200 ---- > AUTOBOXING -- > Integer 200
        // nums.add(Integer num);//
        nums.add( Integer.valueOf("200"));   // Integer.valueOf("200") -- > Integer 200
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        System.out.println(nums);


        // .contains(400) --- >   returns boolean -- > true if exists otherwise false if there is no match
        System.out.println( nums.contains(400) );
        boolean hasValue = nums.contains(700);
        System.out.println(hasValue);


    }
}