package day20_nested_loops;

import java.util.Scanner;

/*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class PrimeInRange {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number to find all the prime numbers up to that number: ");
        int userNum = key.nextInt();  // 50



        for (int i = 1; i <= userNum; i++) {


            int count = 0;
            int singleNum = i; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10... 50

            for (int j = 1; j <= singleNum; j++) {
                if (singleNum % j == 0) {
                    count++;
                }
            }

            if (count == 2){
                System.out.print(singleNum + " ");
            }


        }


        /*
            1, 2, 3, 4, 5 ,6

                1
                    1
                2
                    1, 2
                3
                    1, 2, 3
         */


    }
}