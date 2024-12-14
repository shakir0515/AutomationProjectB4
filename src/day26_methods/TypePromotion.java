package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {

        // whole number --- > default --- > int
        // decimal number - > default --- > double


        use((byte)10); // short
        // use(10);  // here the value is int by default
        byte b = 10;
        use(b);
        System.out.println("--------------------");

        use(10);

        System.out.println("--------------------");

        use(10.0);


        System.out.println("--------------------");

        use(23.22f);

        /*
            // byte short int long float double
            NOTE: when you call the method, it starts looking for the matching data type parameter
            Example:
                byte -- > byte  > short > int > long > float > double
                short - > short > int > long > float > double
                int  -- > int > long  > float > double
                long -- > long > float > double
                float -- > float > double
                double -- >  double
         */

    }


    public static void use (double d){
        System.out.println("calling double method");
    }


    public static void use (float f) {
        System.out.println("calling float method");
    }


    public static void use (long l) {
        System.out.println("calling long method");
    }


    public static void use (int i){
        System.out.println("calling int method");
    }

    public static void use (short s) {
        System.out.println("calling short method");
    }


    public static void use (byte b) {
        System.out.println("calling byte method");
    }


}

