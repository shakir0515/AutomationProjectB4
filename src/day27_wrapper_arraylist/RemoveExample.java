package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList <String> arrList = new ArrayList<>(); // capacity 10 -- > save a memory that can store 10 elements
        System.out.println(arrList.size()); // size: 0
        System.out.println(arrList);    // []


        // Lets add some data/info in it.
        // arrList.add(10); // NOT VALID - > ArrayList is String data type not Integer
        // arrList.add(true); // NOT VALID - > ArrayList is String data type not Boolean
        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("butter");
        System.out.println(arrList); // INSERTION ORDER IS KEPT. ArrayList is ORDERED
        arrList.add(0, "banana");
        System.out.println(arrList);

        System.out.println();
        // How can I remove element from specific index
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.remove(0);
        System.out.println(arrList);
        System.out.println(arrList.size());

        //arrList.remove(4); // Since the last index is 3 -- > this will throw an IndexOutOfBoundsException
        //System.out.println(arrList);
        //System.out.println(arrList.size());


        System.out.println();
        String removedElem = arrList.remove(1); // This method also returns the element which was removed
        System.out.println("Removed element: " + removedElem);
        System.out.println(arrList);
        System.out.println(arrList.size());


        System.out.println();
        // remove the last element
        arrList.remove( arrList.size() - 1 );
        System.out.println(arrList);
        System.out.println(arrList.size());

        System.out.println();
        arrList.add("api");
        arrList.add("sql");
        arrList.add("soft-skills");
        arrList.add("agile");
        arrList.add("soft-skills");
        System.out.println(arrList); // [java, water, api, sql, soft-skills, soft-skills]

        boolean isRemoved = arrList.remove("soft skills");
        System.out.println(isRemoved);
        System.out.println(arrList);

        System.out.println();
        boolean isRemoved2 = arrList.remove("soft-skills");
        System.out.println(isRemoved2);
        System.out.println(arrList);


    }
}