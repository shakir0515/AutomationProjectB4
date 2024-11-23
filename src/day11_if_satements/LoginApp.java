package day11_if_satements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int expectedPinCode = 1111;
        int expectedSSNLast4 = 9876;

        int actualPinCode;
        int actualSSNLast4;

        System.out.print("Welcome to ATM. \n\tPlease, enter your pincode: ");
        actualPinCode = key.nextInt();
        System.out.print("\tPlease, enter your last 4 digits for SSN: ");
        actualSSNLast4 = key.nextInt();


        System.out.println();
        if (actualPinCode == expectedPinCode && actualSSNLast4 == expectedSSNLast4) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");

            if (actualPinCode != expectedPinCode) {
                System.out.println("incorrect pin code");
            }

            if (actualSSNLast4 != expectedSSNLast4) {
                System.out.println("invalid ssn");
            }
        }



        /*
            1. POSITIVE scenario
                1. Valid pincode - Valid ssn


            2. NEGATIVE scenario
                1. Invalid pincode - Invalid ssn
                2. Valid pincode -  Invalid ssn
                3. Invalid pincode - Valid ssn
                4. blank pincode - blank ssn
         */









    }
}
