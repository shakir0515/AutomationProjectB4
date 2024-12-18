package day27_wrapper_arraylist;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {

        /*
            ArrayList
                - size is flexible
                - works only with Object data type
         */
        int [] arr;                     // array works with primitive
        Integer [] arr2;                // array works with Object/non-primitive datatype
        //ArrayList <int> arrList;      // Collection Data Structures does NOT work with primitive data type
        ArrayList <Integer> arrList2;   // Collection Data Structures work ONLY with Object Type / Non-primitive


        ArrayList <Integer> arrList3 = null; // I created ArrayList of Integer reference with no object meaning being null
        System.out.println(arrList3); // null -- > no object
        ArrayList <Integer> arrList4 = new ArrayList<>(); // I created ArrayList of Integer reference with object being empty
        System.out.println(arrList4); // [] ---- > empty


        // The code below is also the declaration of ArrayList but not in USE a lot.
        ArrayList <Integer> arrList5 = new ArrayList<Integer>(20);


        System.out.println();
        //System.out.println(arrList3.size()); // NullPointerException
        System.out.println(arrList4.size());
        System.out.println(arrList5.size());


        // How to add elements into ArrayList
        System.out.println();
        arrList4.add(45);
        System.out.println(arrList4);
        System.out.println(arrList4.size());

        arrList4.add(-90);  // ArrayList is ORDERED --- > keeps the insertion order
        System.out.println(arrList4);
        System.out.println(arrList4.size());


        arrList4.add(55); // ArrayList is ORDERED --- > keeps the insertion order
        arrList4.add(-100); // ArrayList is ORDERED --- > keeps the insertion order
        System.out.println(arrList4);
        System.out.println(arrList4.size());


        System.out.println();
        arrList4.add(1, 50); // [45, -90, 55, -100]
        System.out.println(arrList4);
        System.out.println(arrList4.size());

        //arrList4.add(10, 50);  // Since I do not have index 10, it will throw IndexOutOfBoundsException
        //System.out.println(arrList4);
        //System.out.println(arrList4.size());


        System.out.println();
        // [45, 50, -90, 55, -100]
        // How to reach each of those elements from ArrayList
        // int [] num = { 1, 34, 6, 24, 236];
        //                0   1  2   3   4
        // num[0] -- > 1
        // num[1] -- > 34
        // num[num.length-1] -- > 236
        System.out.println( arrList4.get(0) );
        System.out.println( arrList4.get(1) );
        System.out.println( arrList4.get( arrList4.size()-1 ) );
        //System.out.println( arrList4.get(5) ); // Since the the last index is 4, it will throw IndexOutOfBoundsException


        System.out.println();
        // How do we know how many element swe have in Arraylist
        System.out.println(arrList4.size());
        arrList4.add(200);
        System.out.println(arrList4.size());
        int sizeOfArrList = arrList4.size();
        int firstElemInArrList = arrList4.get(0); // arrList4.get(0); --- >  Integer 45 -- > UNBOXING(Automatically) -- > int 45


    }
}
