package day09_b_if_statements;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70 --- > tem >= 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
 */
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter the temperature: ");
        int temp = key.nextInt();

        if (temp >= 70){   // if (temp > 70 || temp == 70) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("Its too cold");
            System.out.println("Code more Java");
        }


    }
}