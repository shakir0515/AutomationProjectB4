package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        // Array works with both: primitive and non-primitive(Object)
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.asList(arr2); // converting array int arraylist


        // ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(arr));  // ArrayList does not work with "int"
        ArrayList <Integer> list2 = new ArrayList<>( Arrays.asList(arr2) ); // Converted Integer arr into Integer ArrList and assigned
        System.out.println(list2);

        // since .asList(var args); method accepts the paramter as var args, I can directly, send all values and assign it into ArrayList
        ArrayList <Integer> list3 = new ArrayList<>( Arrays.asList( 11, 22, 33, 44, 55, 66, 77, 88, 99) );
        System.out.println(list3);

        ArrayList <String> list4 = new ArrayList<>( Arrays.asList("java", "api", "sql", "ci/cd"));
        System.out.println(list4);

        System.out.println();
        //ArrayList <Integer> list5 = new ArrayList<>(   Arrays.asList(   arr   )       ); // int [] arr
        ArrayList <Integer> list6 = new ArrayList<>(   Arrays.asList(   primitiveArrToObjectArr(arr)   )       );
        System.out.println(list6);


    }


    // convert int arr into Integer arr
    public static Integer [] primitiveArrToObjectArr (int [] arr) {
        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i < objArr.length; i++) {

            objArr[i] = arr[i]; //  int --- > Integer ----- > AUTOBOXING

        }

        return objArr;
    }


    // convert double arr into Double arr
    public static Double [] primitiveArrToObjectArr (double [] arr) {
        Double [] objArr = new Double[arr.length];

        for (int i = 0; i < objArr.length; i++) {

            objArr[i] = arr[i]; //  int --- > Integer ----- > AUTOBOXING

        }

        return objArr;
    }
}
