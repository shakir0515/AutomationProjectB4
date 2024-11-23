package day08_scanner_logical_operators;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

int sum = num1 + num2 + num3;

        System.out.println("Total = " + sum);

        int afterDevisionDividedBy2 = sum / 2;

        System.out.println("After divided by 2: " + afterDevisionDividedBy2);

        System.out.println("After added 2: " + (afterDevisionDividedBy2 + 2));
        System.out.println("After added 2: " + (afterDevisionDividedBy2%2));
    }
}
