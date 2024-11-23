package day07_relational_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 10;     // declared and initialized (assigned first value)
        a = 20;         // re-assigned a new value
        a++;            // re-assigned by POST INCREMENT (increased value by 1) -- > a = a + 1;
        ++a;            // re-assigned by PRE INCREMENT (increased value by 1) --- > a = a + 1;
        a = a + 1;      // re-assigned by adding 1 in regular way.


        a = a + 10;     // re-assigned by adding 10 in regular way
        a += 10;        // re-assigned by SHORTHAND OPERATOR (increasing it by 10) -->  a = a + 10;
        System.out.println(a); // a = 43
        // a =+ 10;        // This is not SHORTHAND OPERATOR
        a = 10 + 23;    // a += 23; --- > a = a + 23;  -- > a = 43 + 23 -- > So, NOT SAME


        System.out.println();
        int b = 2;
        b *= 3;  // b = b * 3; --- > b = 2 * 3; --- > b = 6;
        System.out.println(b);


        System.out.println();
        int c = 10;
        c %= 3; // c = c % 3; --- > c = 10 % 3; --- >  1
        System.out.println(c);
    }
}
