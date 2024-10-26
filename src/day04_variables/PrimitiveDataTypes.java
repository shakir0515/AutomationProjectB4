package day04_variables;

public class PrimitiveDataTypes {
    /*

    Data Types:
        1) Primitive
            a) Integer Type         - byte, short, int, long
            b) Floating Type        - float, double
            c) Single characters    - char
            d) true/false           - boolean

        2) Non-Primitive
            * Sequence of chars     - String
     */

    public static void main(String[] args) {

        byte age = 34;              // Declared a variable called age and datatype is byte and assigned a value 34;
        System.out.println("age");  // "age" is not a variable name. It is a value itself of String dataType
        System.out.println(age);    // age is variable here. Datatype is --> byte
        System.out.println(34);     // by default int

        // byte b2 = 200; // This will cause an error because byte holds from -128 to 127. 200 is big for this container

        System.out.println("------");

        short year;                 // Declared a variable called year and datatype is short
        year = 2024;                // We assigned a value of 2024 to the variable called year
        System.out.println(year);   // year is a variable here, datatype is --> short
        System.out.println(2024);   // 2024 is a value and BY DEFAULT whole numbers are --> int

        System.out.println("------");

        int ipNumber = 123456;          // Declare a variable called ipNumber and datatype is int
        System.out.println(ipNumber);   // ipNumber is a variable and datatype is --> int
        System.out.println(123456);     //123456 is a value and BY DEFAULT whole numbers are --> int

        System.out.println("------");

       long accNumber = 1234567812345678L; //Declared a variable called accNumber and datatype is --> long and assigned a value directly with having "L" or "l" at the end of the value
        System.out.println(accNumber);


    }
}
