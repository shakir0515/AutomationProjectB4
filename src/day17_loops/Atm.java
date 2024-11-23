package day17_loops;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int validPin = 7777;
        int userEnteredPin;
        int attemptCount = 0;


        // CHALLENGE: allow user to attempt max 3 times.

        System.out.println("Welcome To ATM");
        do {
            System.out.print("Please, enter PIN: ");
            userEnteredPin = key.nextInt();
            attemptCount++;
            System.out.println("This is " + attemptCount + " attempt");

        } while (userEnteredPin != validPin && attemptCount < 3);  // as long as attempt is less or equal to 3 continue loop.




        if (attemptCount >= 3 && userEnteredPin != validPin) {
            System.out.println("You are locked out. Password is incorrect");
            System.out.println(attemptCount);
        } else if (userEnteredPin==validPin){
            System.out.println("You are logged in");
        }
    }
}