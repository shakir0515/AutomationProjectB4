package day09_b_if_statements;

import java.util.Scanner;

public class EvenOrOddWithSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int num = input.nextInt();

        boolean isEven = num % 2 == 0; // even
        //boolean isOdd = num % 2 == 1;  // odd
        //boolean isOdd = num % 2 != 0;  // odd - same result with different logic


//        System.out.println(num + " is even: " + isEven);
//        System.out.println(num + " is odd: " + isOdd);


        if (isEven) {
            System.out.println(num + " is even");
        }

        if (!isEven) {
            System.out.println(num + " is odd");
        }


    }
}


