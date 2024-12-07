package day24_methods;
// Create 4 custom methods tha accepts two parameters and calculates
// ADDITION, SUBTRACTION, MULTIPLICATION and DIVISION

public class MyMatchClass {
    public static void main(String[] args) {

        addition(12, 34);
        addition(50, 100);

        System.out.println();
        subtraction(20, 50);
        subtraction(55, 15);

        System.out.println();
        multiplication(2, 4);
        multiplication(10, -3);

        System.out.println();
        division(10, 2);
        division(10, 0);
        division(10, 2);


    }

    public static void addition (int num1, int num2) { // PARAMETERIZED method: 2 parameters
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtraction (int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
    }

    public static void multiplication (int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
    }

    public static void division (int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Not divisible by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
        }
    }


}