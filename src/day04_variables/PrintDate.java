package day04_variables;

public class PrintDate {
   /*
     Task:
        declare and assign 3 variables
        the month number, the day number and year number

        print the date in the following fdrmat:
            month/day/year
    */

    public static void main(String[] args) {
        // declare and assign 3 variables --> the month number, the day number and year number

        int month = 10;
        int day = 23;
        int year = 2024;

        //print this format ---> month/day/year
        //System.out.println(month/day/year);
        System.out.println(month + "/" + day + "/" + year);

        //print this format ---> month\day\year
        System.out.println(month + "\\" + day + "\\" + year);

        System.out.println(month + "-" + day + "-" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "<>" + day + "<>" + year);
        System.out.println(month + day + year);
        //                   int + int + int ---> math plus (addition)
    }

}
