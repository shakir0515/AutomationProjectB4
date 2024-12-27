package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {

        // Let's say, I want to build a function (method), that returns me days of week
        System.out.println( getDaysOfWeek() );

        ArrayList <String> weekDays = getDaysOfWeek(); // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        // Get me the first day from ArrayList
        System.out.println(weekDays.get(0));


        // Build another function that prints the given ArrayList in specific form
        /*
            LIST:
                Element1
                Element2
                ....
         */
        printElements(weekDays);


    }

    public static void printElements (ArrayList <String> list) {
        System.out.println("LIST:");
        for ( String each : list){
            System.out.println("\t" + each);
        }

    }


    public static ArrayList<String> getDaysOfWeek () {
        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));

        return weekDays;
    }

}
