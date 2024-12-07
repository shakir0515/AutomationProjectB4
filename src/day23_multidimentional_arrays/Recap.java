package day23_multidimentional_arrays;

import java.util.Arrays;
public class Recap {
    public static void main(String[] args) {
        int [] arr1 = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 60, 90};


        // how to print arrays / how to convert array to String (with square brakcets and commas)
        String str = Arrays.toString(arr1);
        System.out.println(str);
        System.out.println(  Arrays.toString(arr1)  );
        System.out.println(  Arrays.toString(arr2)  );


        System.out.println();
        // how to compare two arrays
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);
        System.out.println(  "Before sorting compare: " + Arrays.equals(arr1, arr2)  );


        System.out.println();
        // how to sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println( "After sorting compare: " + Arrays.equals(arr1, arr2));
        System.out.println( Arrays.toString(arr1));
        System.out.println( Arrays.toString(arr2));


        System.out.println();
        // how to join elements in Array / how to covert array into String
        String [] strArr = {"java", "selenium", "jira", "sprint", "release"};
        String str2 = String.join("", strArr);
        System.out.println(str2);
        System.out.println( String.join("##", strArr)  );


        System.out.println();
        // how to convert String into String array
        String str3 = "Today is Thursday";
        String [] str3Arr = str3.split(" "); // size: 3
        System.out.println(  Arrays.toString( str3Arr ));
        System.out.println(  str3Arr.length);


        System.out.println();
        // how to convert String into char array
        String str4 = "loopcamp";
        char [] str4Arr = str4.toCharArray();
        System.out.println(  Arrays.toString( str4Arr));
        System.out.println( Arrays.toString( str4.toCharArray() )  ); // char array
        System.out.println( Arrays.toString( str4.split("") )); // String array


    }
}

