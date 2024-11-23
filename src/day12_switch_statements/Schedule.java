package day12_switch_statements;

import java.util.Scanner;

/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("What day do you want to know about? ");
        String day = key.next();
        String information;

        switch (day){
            case "Monday": case "Mon": case "MONDAY": case "mon": case "MON":
                information = "We have mentor sessions on Mondays!";
                break;
            case "Tuesday":
            case "Friday":
                information = "We do not have a class!";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                information ="Beautiful DAYYYYYY. Java class";
                break;
            case "Sunday":
                information ="\"Beautiful beautiful\" DAYYYYYY. Java class";
                break;
            default:
                information = "No valid input!";

        }

        System.out.println(information);

    }

    // MON, Mon


}
