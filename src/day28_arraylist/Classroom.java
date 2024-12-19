package day28_arraylist;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println(nums);

        System.out.println( nums.size() );
        System.out.println( nums.get(0) );
        System.out.println( nums.get(nums.size() - 1) );

        nums.add(300);
        nums.add(300);
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);

        nums.add(2, 800);
        System.out.println(nums);

        // nums.remove(300); // in here 300 is primitive and it is for index
        // Integer n = 300;
        nums.remove( (Integer)300 ); // in here 300 is primitive and it is for index
        System.out.println( nums );


    }
}
