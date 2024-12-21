package day29_arraylist;

import my_utilities.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {

        // .addAll() method
        ArrayList <String> allJobs = new ArrayList<>();  // currently it is empty --- size is 0
        allJobs.addAll(Arrays.asList( "SDET", "Developer", "PO", "CEO", "DevOps", "QA", "QE", "BA", "PO"));
        System.out.println("Original: " + allJobs);


        // .removeAll() method
        ArrayList <String> jobs1 = new ArrayList<>(allJobs);
        // jobs1.removeAll("QA", "PO", "QE", "BA"); // NOT VALID
        jobs1.removeAll(Arrays.asList("QA", "PO", "QE", "BA", "QI")); // will remove all the matches
        System.out.println("After 1st remove: " + jobs1);





        // .retainAll()  method
        ArrayList <String> jobs2 = new ArrayList<>(allJobs);
        // jobs2.retainAll( "QA", "PO", "QE", "BA"); // NOT VALID
        jobs2.retainAll( Arrays.asList( "SDET", "Developer", "DevOps", "QI" ));  // keep what is in the parentheses that are matched and remove all other not matched
        System.out.println("After 2nd remove: " + jobs2);


        // .containsAll();
        ArrayList <String> jobs3 = new ArrayList<>(allJobs);
        // jobs3.containsAll("DevOps", "PO");  // NOT VALID
        System.out.println(   jobs3.containsAll(Arrays.asList("DevOps", "PO"))   );  // VALID
        System.out.println(   jobs3.containsAll(Arrays.asList("DevOps", "PO", "QI"))   );  // VALID
        System.out.println(   jobs3.containsAll(Arrays.asList("DevOps", "po"))   );  // VALID

        System.out.println(  jobs3.contains("SDET") );
        System.out.println(  jobs3.contains("QI") );



    }



}
