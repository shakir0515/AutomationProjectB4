package day17_loops;

import java.util.Scanner;
/*
    create a program to guess the secret number.
    flow will be as follows:
    define the secret number, hard coded
    ask the user to guess a number
    based on the guess tell them a message:

        if they guess higher than the number:
          too high

        if they guess lower than the number:
          too low

        if they guess the number:
          you guessed correctly

          -> this will stop the guessing flow
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess;

        do{
            System.out.print ("Please, guess the number: ");
            userGuess = key.nextInt(); // 777

            if (userGuess < secretNumber){
                System.out.println("It is too low");
            } else if (userGuess > secretNumber){
                System.out.println("It is too high");
            } else {
                System.out.println("Guess Correctly");
            }

        } while (userGuess != secretNumber);//


        /*
            TODO: Home Practice
                In this code implement a logic that tells me after how may tries, I found the correct
                    - Print "After n-th try you guessed it."

         */



    }

}