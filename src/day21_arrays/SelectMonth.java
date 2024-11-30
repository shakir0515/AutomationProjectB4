package day21_arrays;

import java.util.Scanner;
/*

    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers

 */
public class SelectMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please, enter a number and I will give you a month name.");

        String month1 = "January";
        String month2 = "February";
        //...
        String month12 = "December";

        System.out.println("Please, enter a number and I will give you month name.");
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //                    0      1      2      3      4      5      6       7    8       9       10    11


        int userNum;

        do {
            System.out.println("Enter: ");
            userNum = key.nextInt();

            if (userNum >= 1 && userNum <= 12) {
                System.out.println("The month for number " + userNum + " is " + months [ userNum - 1 ]);
            }


//            if (userNum == 1) {
//                System.out.println(month1);
//            }
//
//
        } while (!(userNum < 1 || userNum > 12)); // if userNum is not in range, ask again
//        } while (!(userNum >= 1 && userNum <= 12));
//
//        if (userNum >= 1 && userNum <= 12) {
//            if (userNum == 1) {
//                System.out.println(month1);
//            } else if (userNum==2){
//                System.out.println(month2);
//            } else if (userNum==12) {
//                System.out.println(month12);
//            }
//        } else {
//         System.out.println("Number is not between 1 and 12");
    }
  }


