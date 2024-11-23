package day08_scanner_logical_operators;

public class Logical_Operators {
    public static void main(String[] args) {

        int n = 100;

        // relational operators
        System.out.println(n > 5);  // this is a single different statement
        System.out.println(n < 20); // this is a single different statement

        // relational and logical operators
        System.out.println(n > 5 && n < 20);  // this is a single statement using logical and relational operators
        //                 false && n < 20
        //                 false && true
        //                 false
        //                  range 5 ----- 20


        System.out.println("-----------");

        System.out.println(6 > 1 || false);
        //                  true || false
        //                  true

        System.out.println(1 > 5 || false);
        //                  false || false
        //                  false

        System.out.println("-----------");
        System.out.println(true);
        System.out.println(!true); // NOT operator -- > NOT true --- > false
        System.out.println(!false); // -------------- > NOT false -- > true

        System.out.println(!(6 != 6));
        // (6 != 6) --- > false
        // !false  ---- > true
    }
    }
