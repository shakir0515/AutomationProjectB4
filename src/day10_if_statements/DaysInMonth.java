package day10_if_statements;

import java.util.Scanner;

/*
            create an int variable to represent the month number, where 1 is January and 12 is December.
        use the month number input to determine how many days are in that month.
        use the following data to help you determine the number of days in each month:

            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11
            Month that has 28 days: 2

            ex:
                12
                31 days

            ex:
                9
                3

   */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a number between 1 and 12 inclusive which represents each month: ");
        int monthInNum = input.nextInt();  // 1

//        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
//        Months that has 30 days: 4, 6, 9, 11
//        Month that has 28 days: 2

        boolean has31Days = monthInNum == 1 || monthInNum == 3 || monthInNum == 5 || monthInNum == 7 || monthInNum == 8 || monthInNum == 10 || monthInNum == 12;
        boolean has30Days = monthInNum == 4 || monthInNum == 6 || monthInNum == 9 || monthInNum == 11;
        boolean has28Days = monthInNum == 2;

        // BELOW we have 3 SINGLE IF statements

        if (has31Days ) {
            System.out.println("Month has 31 days");
        }

        if (has30Days) {
            System.out.println("Month has 30 days");
        }

        if (has28Days)
            System.out.println("Month has 28 days"); // single statement, So, I can do it with NO brackets


        System.out.println("----------------------------------------------------------");

        if (has31Days){
            System.out.println("It has 31 days");
        } else if (has30Days){
            System.out.println("It has 30 days");
        } else if (has28Days) {
            System.out.println("It has 28 days");
        } else {
            System.out.println("The number you have given is not in the range of 1 and 12\n\tYour number was: " + monthInNum);
        }




    }



}