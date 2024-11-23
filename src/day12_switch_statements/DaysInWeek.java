package day12_switch_statements;

import java.util.Scanner;

/*
Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numInWeek;

        System.out.print("Please, enter a day in num that represents a week day: ");
        numInWeek = key.nextInt();  // 1
        String day;

        switch (numInWeek){  // String, char, int, short, byte
            // case "1":  // 1 == "1"  // We cannot do this since data type is not matching

            case 1:  // 1 == "1"
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:  // num>=6 && num <=7
            case 7:
                day = "Weekend";
                break;
            default:
                day = "Not valid num day in week";

        }

        System.out.println(day);

        // if the num is 6, 7 --- > weekend


        // If you do not put "break;" -- >  execution goes from matching case/default all the way until the first "break" or all the way to the end if not break at all;

    }
}
