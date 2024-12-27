package day27_wrapper_arraylist;

public class MaxAndMinValues {
    public static void main(String[] args) {

        // IN Each Wrapper class we have some use full info we can use: can be a method, or values (constants)

        // Primitive data types have value ranges
        // byte ---- > -128 --- 127
        System.out.println( Byte.MIN_VALUE  );  // FIXED  value -- > meaning the minimum value for byte will always be -128. Cannot change
        System.out.println( Byte.MAX_VALUE  );

        System.out.println( Integer.MIN_VALUE);
        System.out.println( Integer.MAX_VALUE);


        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Double.MIN_VALUE); // Since it is big data - it will show it differently in output
        System.out.println(Double.MAX_VALUE); // Since it is big data - it will show it differently in output


    }
}