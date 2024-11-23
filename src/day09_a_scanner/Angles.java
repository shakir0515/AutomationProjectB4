package day09_a_scanner;
/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */
//#1 - Importing package
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        //#2 - Declaring Scanner Object
        //Object reference = Object itself
        Scanner key = new Scanner(System.in);
        boolean isTriangle, isCircle;

        System.out.println("Enter 3 angles (in decimals): ");
        // key.nextDouble(); // taking info from user
        double angle1 = key.nextDouble(); // taking info from user and assigning into container/variable called angle1
        double angle2 = key.nextDouble(); // taking info from user and assigning into container/variable called angle2
        double angle3 = key.nextDouble(); // taking info from user and assigning into container/variable called angle3

        double total =  angle1 + angle2 + angle3;
        isTriangle = total == 180; // 180 == 180 --- > true
        isCircle = total == 360;

        System.out.println("It is triangle: " + isTriangle);
        System.out.println("It is circle: " + isCircle);


    }

}