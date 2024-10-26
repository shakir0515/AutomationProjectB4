package day06_a_arithmetic_operators;

public class TypeCasting {
// Casting Order -> byte -> short -> int -> long -> long -> float -> double
    public static void main(String[] args) {

    /*
    Converting / changing one primitive data type to another data type

	ORDER: [SMALL] - > byte - > short -> int - > long -> float -> double  [BIGGER]


	There are 2 types of conversion

		1) WIDENING CONVERSION / WIDENING CASTING (IMPLICIT CASTING)
			Going from a smaller type to a bigger type.
			This happens automatically.




		2) NARROWING CONVERSION / NARROWING CASTING (EXPLICIT CASTING)
			Going from bigger data type to a smaller type.
			This happens manually (explicitly)

				Casting formula:

						dataType variableName1 = (dataType) variableName2; (variabName2 - > bigger dataType)

						EX:
							long number = 100;
							int i = (int)number;



	 	Data Loss:
	 		If you go from bigger data type to a smaller data type and smaller data type can NOT hold the value in the range, there will be some data lost


	 	Q: can we have casting between numbers and character (int and char)?
	 	A: We are able to case between int and char because char also has numbers assigned to them.

     */

        int num1 = 10;
        float num2 = num1; // going from SMALL to BIG  (Assigning the SMALL into BIG) WIDENING CASTING - happens AUTOMATICALLY (IMPLICITLY)
        System.out.println(num1);
        System.out.println(num2);


        System.out.println();
        float num3 = 3.4F;
        short num4 = (short)num3;  // going from BIG to SMALL (Assigning the BIG into SMALL) NARROWING CASTING - happens MANUALLY (EXPLICITLY) - there might be a DATA LOSS
        // short num5 = (int)num3;     // going from FLOAT to INT -- > INT is bigger than SHORT
        short num6 = (byte)num3;     // going from FLOAT to BYTE -- > BYTE is smalled than SHORT - so it can hold it - No need to EXPLICIT casting
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num6);


        // We can convert the char into int because each character has a number assigned to it from ASCII/UNICODE table.
        System.out.println();
        char letter  = 'A';
        int letterInNum = letter; // going from SMALLER to BIG - no need EXPLICIT CASTING
        System.out.println(letter);
        System.out.println(letterInNum);

        String letter2 = "B";
        // int letterInNum2 = letter2;  // NOT VALID

        System.out.println('C');
        System.out.println((int)'C');
        System.out.println((int)'%');

    }
}

