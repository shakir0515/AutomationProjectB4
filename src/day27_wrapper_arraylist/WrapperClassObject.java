package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 5; // primitive data type for variable 'a'


        //Integer a2 = new Integer(10);  // deprecated/not in use after java version 9
        Integer a3 = 20; // 20 -- > int --- > Integer --- > AUTOBOXING
        int a4 = a3;  //  Integer -- > int -------------- > UNBOXING

        System.out.println(a);
        System.out.println(a3); // Integer
        System.out.println(a4); // int



        byte b = 2;     // Primitive
        Byte b2 = 20;   // Wrapper Class type / Object type / Non-Primitive

    }
}