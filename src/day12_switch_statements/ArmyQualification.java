package day12_switch_statements;

import java.util.Scanner;

/*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

    - The person must be a citizen or a resident
        -> If not print: You must be a citizen or a resident
    - Their age must be between 18 and 35  //----- > 18 <= age <= 35
        -> If not print: Your age must be between 18 to 35 years old
    - They must have a high school diploma
        -> If not print: You must have a high school diploma

    > If all the criteria is met print: You are qualified for the Army
 */
public class ArmyQualification {
    public static void main (String [] args) {

        boolean isCitizen, isResident;
        boolean hasDiploma;
        int age;

        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to Army Station");
        System.out.println("Please, answer the following questions to check eligibility\n");
        System.out.print("\tAre you a citizen (true/false): ");
        isCitizen = key.nextBoolean();
        System.out.print("\tAre you a resident (true/false): ");
        isResident = key.nextBoolean();
        System.out.print("\tDo you have a high school diploma (true/false): ");
        hasDiploma = key.nextBoolean();
        System.out.print("\tHow old are you: ");
        age = key.nextInt();


        if ((isCitizen || isResident) && hasDiploma && 18 <= age && age <= 35 ) {

            System.out.println("You are eligible");

        } else {

            System.out.println("\n\tYou are not eligible for the following reasons:");

            if (!isCitizen || !isResident) {
                System.out.println("\t\tYou must be a citizen or a resident ");
            }

            if (!hasDiploma) {
                System.out.println("\t\tYou must have a high school diploma");
            }

            //if (! (18 <= age && age <= 35) ){  // you can do this as well.
            if (age < 18 || age > 35) {
                System.out.println("\t\tYour age must be between 18 to 35 years old");
            }



        }




//        System.out.println("---------");
//        System.out.println(isCitizen);
//        System.out.println(isResident);
//        System.out.println(hasDiploma);
//        System.out.println(age);




    }
}
