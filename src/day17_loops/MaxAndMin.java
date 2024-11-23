package day17_loops;

import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.


    2
    Ask a user:
    Tell if it is biggest or smallest.

    3
    Ask a user:
    Tell if it is biggest or smallest.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Hey, how many numbers do you want to compare: ");
        int countOfNUm = key.nextInt(); // 8
        int cycle = 1;
        int userNum = 0;

        //int biggest = Integer.MIN_VALUE;  // THis is doing the same thing as below but with FANCY way
        int biggest = -2147483648;
        int smallest = 2147483647;


        // System.out.println(Integer.MAX_VALUE);       // 2147483647 ---- > Inside of this Integer class, there is a way to get the MAX number
        // System.out.println(Integer.MIN_VALUE);       // -2147483648 --- > Inside of this Integer class, there is a way to get the MIN number


        while (cycle <= countOfNUm) {
            System.out.print("Please, enter the number " + cycle + ": ");
            userNum = key.nextInt();

            if (userNum > biggest){
                biggest = userNum;
            }

            if (userNum < smallest){
                smallest = userNum;
            }

            cycle++;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

    }

}
