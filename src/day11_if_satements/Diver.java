package day11_if_satements;

/*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign an int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you are at 50%
 */
public class Diver {
    public static void main(String[] args) {

        int oxygenLevel = 40;


//        if (oxygenLevel > 50) {
//            System.out.println("Be careful now you are at 50%");
//        } else if (oxygenLevel > 60) {
//            System.out.println("Start to head back");
//        } else if (oxygenLevel > 70) {
//            System.out.println("Don't go too far");
//        } else if ( oxygenLevel > 80) {
//            System.out.println("Still okay");
//        } else if (oxygenLevel > 90) {
//            System.out.println("Your tank is full");
//        }


        if (oxygenLevel > 90 ) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if ( oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("See you in heaven");
        }
    }
}