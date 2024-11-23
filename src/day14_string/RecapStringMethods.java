package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        String str1 = "loop";                          // By LITERALS       -- > String Pool/Heap
        String str2 = new String ("loop");      // By 'new' keyword  -- > Heap


        //System.out.println( "Comparing with ==      : " + str1 == str2 );         // "Comparing with ==      : loop" == "loop" ---- > concatenation happens first
        System.out.println( "Comparing with ==      : " + (str1 == str2) );          //  comparing MEMORY LOCATION
        System.out.println( "Comparing with.equals(): " + str1.equals(str2));     //  comparing VALUES


        System.out.println( "Comparing with.equals(): " + str1.equals("loop"));
        System.out.println( "Comparing with.equals(): " + "loop".equals(str2));
        System.out.println( "Comparing with.equals(): " + new String("loop").equals(str2));

        System.out.println();

        System.out.println( "Comparing with.equals(): " + str1.equals("loop"));
        System.out.println( "Comparing with.equals(): " + str1.equals("LOOP"));
        System.out.println( "Comparing with.equals(): " + "LOOP".equals("LOOP"));
        System.out.println( "Comparing with.equalsIgnoreCase(): " + str1.equalsIgnoreCase("loop"));
        System.out.println( "Comparing with.equalsIgnoreCase(): " + str1.equalsIgnoreCase("LOOP"));
        System.out.println( "Comparing with.equalsIgnoreCase(): " + str1.equalsIgnoreCase("LOOP"));


        System.out.println();
        boolean isSameWithNoUpperLowerCase = "lOoP".equalsIgnoreCase( new String ("lOOp") );
        System.out.println(isSameWithNoUpperLowerCase);


        if(isSameWithNoUpperLowerCase) {
            System.out.println("Those two String values are SAME with IGNORING CASE SENSITIVENESS");
        } else {
            System.out.println("Those two String values are NOT same with IGNORING CASE SENSITIVENESS");
        }


        System.out.println();
        System.out.println(str1.length());
        System.out.println(str2.length());

        boolean isLengthSame =  str1.length() == str2.length();
        System.out.println(   str1.length() == str2.length()  );
        System.out.println( isLengthSame );

        int numOfCharactersInString = str1.length();
        System.out.println("Number of characters in str1: " + numOfCharactersInString);

        int num = 9;
        // System.out.println( num.length() ); // You cannot apply String method on int datatype
        System.out.println( (num+"").length() ); // 9 + "" ---- > "9"
        System.out.println(num); // THis is still int - the original datatype


        if (str1.length() % 2 == 0) { // str1 = "loop";
            System.out.println("The word has even number of characters");
        } else {
            System.out.println("The word has odd number of characters");
        }




    }
}



