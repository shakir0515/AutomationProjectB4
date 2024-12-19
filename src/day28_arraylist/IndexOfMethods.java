package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethods {
    public static void main(String[] args) {
        String str = "Loooooop";
        //            01234567
        System.out.println("String: " + str);
        System.out.println( str.indexOf("o") ); // will return the index of the first match
        System.out.println(str.indexOf("K"));   // "l" does exist --- > -1

        System.out.println( str.lastIndexOf("o") ); // will return the index of the last match


        System.out.println();
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(100);
        System.out.println("String ArrayList: " + nums);
        // [100, 200, 300, 400, 500, 600, 100]
        //   0    1    2    3     4    5    6



        // .indexOf(); -- >  will return the index of the first match from the beginning
        System.out.println( nums.indexOf(100) );
        System.out.println( nums.indexOf(700) );

        int indexOf500 = nums.indexOf(500);
        System.out.println(indexOf500);

        System.out.println("-------");
        // .lastIndexOf();  -- >  will return the index of the first match from the end
        System.out.println(  nums.lastIndexOf(100) );


        System.out.println("-------");
        nums.add(350);
        nums.add(450);
        nums.add(100);
        nums.add(250);
        System.out.println(nums);
        //  [100, 200, 300, 400, 500, 600, 100, 350, 450, 100, 250]
        //   0    1    2    3     4    5    6    7    8    9    10

        // change the value of the last 100 to be -100
        // nums.lastIndexOf(100); // 9
        nums.set( nums.lastIndexOf(100), -100);
        System.out.println(nums);


    }
}
