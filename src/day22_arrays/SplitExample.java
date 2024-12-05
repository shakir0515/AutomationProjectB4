package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String str = "monday tuesday wednesday thursday friday saturday sunday";
        System.out.println(str.length());

        String[] days = str.split(" "); //[monday, tuesday, wednesday, thursday, friday, saturday, sunday]
        System.out.println(days.length);
        System.out.println(Arrays.toString(days));


        for (String each : days) {
            System.out.println(each);
        }

        System.out.println("----------");
        String[] days2 = str.split("day"); // [mon,  tues,  wednes,  thurs,  fri,  satur,  sun]
        System.out.println(Arrays.toString(days2));


        for (int i = 0; i < days2.length; i++) {
            days2[i] = days2[i].trim(); // we removed space from each element from beginning and end
        }
        System.out.println(Arrays.toString(days2));


        System.out.println("----------");
        String[] days3 = str.split("day "); // [mon, tues, wednes, thurs, fri, satur, sunday]
        System.out.println(Arrays.toString(days3));


        System.out.println("----------");
        String[] days4 = str.split("");  // ["m", "o", "n", d, a, y,  , t, u ...... ]
        System.out.println(Arrays.toString(days4));


        System.out.println("----------");
        String month = "Jan-Feb-Mar-Apr-May-Jun-Apr-July";
        String[] monthArr = month.split("-");
        System.out.println(Arrays.toString(monthArr));

        System.out.println("----------Regular case--------");
        String[] monthArr2 = month.split("Apr");
        System.out.println(monthArr2.length); //
        System.out.println(Arrays.toString(monthArr2));


        System.out.println("----------lower case--------");
        String[] monthArr3 = month.split("apr");
        // String [] monthArr3 = month.toLowercase().split("apr"); // if you want to ignore case sensitiveness
        System.out.println(monthArr3.length); //
        System.out.println(Arrays.toString(monthArr3));


        System.out.println("----------");
        String[] monthArr4 = month.split("Dec");
        System.out.println(monthArr4.length);
        System.out.println(Arrays.toString(monthArr4));


        // String [] monthArr3 = month.toLowercase().split("apr");
        //      "Jan-Feb-Mar-Apr-May-Jun-Apr-July"; -- >  "jan-feb-mar-apr-may-jun-apr-july";
        //      . split ("apr")

        // String [] monthArr3 = month.split("APR".toLowerCase());  //you can apply this but why you cant apply ignore case?
        // month.split("apr");
        //  "Jan-Feb-Mar-Apr-May-Jun-Apr-July"; --- > "apr"


    }
}
