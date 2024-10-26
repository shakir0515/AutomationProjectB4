package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int y = 5;
        System.out.println(y);
        y = -y; // re-assigned to a new value --- > new value is the negative version of itself.
        System.out.println(y);

        System.out.println("---");
        int x = 0;
        System.out.println(x);

        x = x + 1; // Here, re-assigning a new value to x --- > new value is adding 1 to itself
        System.out.println(x);

        System.out.println("---");
        //PRE-INCREMENT - increasing it by 1
        ++x; // x = x + 1;
        System.out.println(x); // 2

        //POST-INCREMENT - increasing it by 1
        x++; // x = x + 1;
        System.out.println(x); // 3

        System.out.println("---");
        // Sometimes, you need to update the variable inside of the action / statement

        //  In the print statement below, I got 2 actions
        //          1. print statement
        //          2. re-assigning x (PRE-INCREMENT)
        System.out.println(++x);
        // ORDER
        // 1. PRE-INCREMENT --> x = 4;
        // 2. then print  -- > 4
        System.out.println(x); // 4



        System.out.println("---");
        //  In the print statement below, I got 2 actions
        //          1. print statement
        //          2. re-assigning x (POST-INCREMENT)
        System.out.println(x++); //
        // ORDER
        // 1. print  -- > 4
        // 2. then POST-INCREMENT --> x = 5
        System.out.println(x);   //



        System.out.println("---");
        --x;
        System.out.println(x);
        x--;
        System.out.println(x); // 3

        System.out.println("---");
        System.out.println(--x); // x = 2
        System.out.println(x);

        System.out.println(x--);
        System.out.println(x);




    }
}
