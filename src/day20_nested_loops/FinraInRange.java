package day20_nested_loops;
import java.util.Scanner;

public class FinraInRange {

    public static void main(String[] args) {

        // range = 50;   1, 2, 3, 5, 6, 7 ......... 50;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a number to get all \"FIN/RA/FINRA\": ");
        int userNumRage = scan.nextInt();


        for (int i = 1; i <= userNumRage; i++) {
            int num = i;


            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " - FINRA");
            } else if (num % 3 == 0) {
                System.out.println(num + " - FIN");
            } else if (num % 5 == 0) {
                System.out.println(num + " - RA");
            }

        }




    }

}



/*
    if divisble by 3 --- > FIN
    if divisible by 5 -- > RA
    if divisble by 15 -- > FINRA
 */