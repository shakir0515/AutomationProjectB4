package day27_wrapper_arraylist;

public class ParseNumber {
    public static void main(String[] args) {

        /*

                         DATA TYPE      VALUE                 CONVERT TO BE WRAPPER                         CONVERT to be primitive
            "1"     --- > String        number      Byte.valueOf("1") --------- > Byte b = 1               Byte.parseByte("1") --------- > byte b = 1;
            "true"  --- > String        boolean     Boolean.valueOf("true") --- > Boolean bl = true;       Boolean.parseBoolean("true) - > boolean bl = true;




         */


//        if ("true"){
//            System.out.println("PASS");
//        }

        if (Boolean.valueOf("true")){ // converting String into Wrapper Class Object data type
            System.out.println("PASS");
        }

        if (Boolean.parseBoolean("true")){  // converting String into primitive data type
            System.out.println("PASS");
        }


        System.out.println("--------------------------------------------------------");


        String year = "2024";

        System.out.println("Current Year is: " + year);
        System.out.println("Nest year will be: " + (year + 1) );  // String + 1 -- > concatenation
        int yearInNUm1 = Integer.parseInt(year);
        int yearInNUm11 = Integer.valueOf(year); // String > Wrapper Class Objet > unboxing [automatically] > primitive

        Integer yearInNUm2 = Integer.valueOf(year);
        Integer yearInNUm22 = Integer.parseInt(year);  // String > primitive > autoboxing [automatically] > Wrapper Class Object

        System.out.println("Nest year will be: " + (yearInNUm1 + 1) );
        System.out.println("Nest year will be: " + (Integer.parseInt(year) + 1) );




        System.out.println("--------------------------------------------------------");

        String price = "23.4";
        double d = Double.parseDouble(price);
        // int a = d;
        System.out.println(d);
        // int d2 = Double.parseDouble(price);
        // int d2 = Integer.parseInt(price); // NumberFormatException


        System.out.println("--------------------------------------------------------");
        String s = "23S";
        // int i = Integer.parseInt(s); // NumberFormatException


        System.out.println("--------------------------------------------------------");
        String s1 = "My car is nice: true";  // If you do not have correct boolean values -- >  it will be always false
        boolean bl = Boolean.parseBoolean(s1);
        System.out.println(bl);

        String s2 = "true";
        boolean bl2 = Boolean.parseBoolean(s2);
        System.out.println(bl2);



    }

    public static void test (int a){


    }

    public static void test (Integer a){

    }
}
