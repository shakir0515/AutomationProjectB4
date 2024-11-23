package day11_if_satements;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 100_000.00;

        System.out.print("WELCOME TO ATM\n\tPlease, insert your card.\n\tThen, please enter your pincode: ");
        int actualPin = key.nextInt();

        if (actualPin == expPin) {
            System.out.println("\n\tYou are logged in. ");
            System.out.println("\tSelect one of the options below: ");
            System.out.println("\t\t1) - Check Balance");
            System.out.println("\t\t2) - Deposit");
            System.out.println("\t\t3) - Withdraw");
            System.out.println("\t\t4) - Cancel");
            System.out.print("\t\tYour choice (1-4): ");
            int userChoice = key.nextInt();  // 1, 2, 3, 4, ----- or any other numbers

            if (userChoice == 1){
                System.out.println("\n\t\tYour balance is $" + balance);
            } else if (userChoice == 2){
                System.out.print("\n\t\tPlease, insert the cash...$");
//                double depMon = key.nextDouble(); // 20,000
//                balance += depMon;
                balance += key.nextDouble();
                System.out.println("\t\tAfter deposit, your new balance is $" + balance);
            } else if (userChoice == 3) {
                System.out.print("\n\t\tPlease, enter the amount you want to withdraw...$");
                double withMon = key.nextDouble();


                // if withMon > balance --- > 120000
                if (withMon > balance) {
                    System.out.println("\t\tNot enough money. Work more and come back.");
                } else {
                    balance -= withMon;
                    System.out.println("\t\tAfter withdraw, your new balance is $" + balance);
                }


            } else if (userChoice ==  4) {

            } else {
                System.out.println("\n\t\tInvalid option. Exiting system by logging you out.");
            }

        } else {
            System.out.println("\n\tInvalid pincode. Go home and try to remember your pincode");
        }



    }
}
