package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "penpen";
        //            012345

        char fistChar = str.charAt(0);
        System.out.println(  str.indexOf('p')  );
        System.out.println(  str.indexOf(fistChar)  );
        System.out.println(  str.indexOf("p")  );

        System.out.println("----");

        //System.out.println(  str.indexOf('pe')); // char cannot hold more than a SINGLE character
        System.out.println(  str.indexOf("pe")); //
        System.out.println(  str.indexOf("np")); //

        System.out.println("----");

        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("e"));

        System.out.println("----");

        System.out.println(str.indexOf("pen"));

        System.out.println("----");

        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf("x"));
        System.out.println(str.indexOf("Pen"));
        System.out.println(str.indexOf("PEN"));

        System.out.println("----");

        // String str = "penpen";
        //               012345

        System.out.println( str.indexOf('e')); // 1
        System.out.println( str.indexOf('e', 1)); // 1
        System.out.println( str.indexOf('e', 2)); // 4

        System.out.println( str.indexOf("e", 1)); // 1
        System.out.println( str.indexOf("e", 2)); // 4

        System.out.println( str.indexOf("en", 1)); // 1
        System.out.println( str.indexOf("en", 2)); // 4


        System.out.println( str.indexOf("np", 3)); // - 1
        System.out.println( str.indexOf("np", 10)); // - 1 // Since index is out of range, inside of out of range, np does not exist. So -1

        System.out.println( str.indexOf("np")); // 2


    }
}