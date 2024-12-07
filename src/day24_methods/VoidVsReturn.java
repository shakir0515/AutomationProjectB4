package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        // String str = sayHi(); // Since this method is a VOID method, it does NOT return anything back.
        sayHi();

        System.out.println();
        sayHi2();
        System.out.println(sayHi2());

        String str = sayHi2();
        System.out.println(str);


    }


    // This is a void type method - which means does not return anything.
    public static void sayHi () {
        System.out.println("Hi");
    }

    // This is a return type method - which means it RETURNS something. Something can be any data type
    public static String sayHi2 () {
        String str = "Hi";  // Local Variable
        return str;
    }

}