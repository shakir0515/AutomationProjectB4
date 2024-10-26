package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 3;  // the 3 value is int. Since we are assigning int into double (we can do it. Why? Because double can hold int. So, IMPLICIT CASTING (WIDENING CONVERSION) is happening
        double num2 = 2;

        double addition = num1 + num2;  // 3 + 2 or 3.0 + 2.0 ? --- >  3.0 + 2.0 -- >. 5.0 (double)
        // When there are two different data types with arithmetic operator, the result is biggest data type
        // int subtraction = num1 - num2;  // 3.0 - 2.0 --- > 1.0 (double)
        // int subtraction = (int)num1 - num2;  // 3 - 2.0 --- > 1.0 (double)
        // int subtraction = (int)num1 - (int)num2;  // 3 - 2 --- > 1 (int)
        // int subtraction2 = (int)(num1 - num2);  // (3.0 - 2.0) --- > 1.0 (double) -- > (int)1.0 --- > 1
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2; // Since my data type are double, I will be able to see the decimal part of the result as well.
        double remainder = num1 % num2; // modules -- > 3.0 % 2.0 --- > 1.0

        System.out.println(num1 + " + " + num2 + " = " + addition );
        System.out.println(num1 + " - " + num2 + " = " + subtraction );
        System.out.println(num1 + " * " + num2 + " = " + multiplication );
        System.out.println(num1 + " / " + num2 + " = " + division );
        System.out.println(num1 + " % " + num2 + " = " + remainder );


        num1 = 13;
        num2 = 5;
        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder );


        System.out.println();
        System.out.println("------------");
        int i1 = 13;
        int i2 = 5;

        // DIVISION
        int div = i1 / i2;
        double div2 = i1 / i2; // 13/5 ---> 3 --- > 3.0
        System.out.println(div);
        System.out.println(div2);

        // MODULE/REMAINER
        int rem = i1 % i2;  // 13 % 5 --- > 3
        double rem2 =  i1 % i2; // 13 % 5 -- > 3 --- > 3.0
        System.out.println(rem); //
        System.out.println(rem2); //

        System.out.println();
        System.out.println("------------");
        System.out.println(3.4 + 1);  // double + int --- > double

        int a = 5;
        double d = 4; // 4.0
        System.out.println(a + d); // 5 + 4.0 -- > int. + double --- >  double


        System.out.println();
        System.out.println("------------");
        byte b = 3;
        short s = 2;
        System.out.println(b * s); // result going to be INT

        byte b1 = 4;
        short s2 = 5;
        // short result = b1 * s2;  // 20 --- > int (because COMPILER takes the whole number as int by default) can NOT be stored into short without casting.
        short result = (short)(b1 * s2);  // 20 --- > int -- > short


        double result2 = b1 + s2;  // byte + short --- > int ---> storing it into double is OK. WIDENING CONVERSION -- > from SMALL to BIG

        int i5 = 4;
        long l5 = i5;
        long result3 = i5 + l5;
        System.out.println(result3);
        System.out.println(result3);
    }
}
