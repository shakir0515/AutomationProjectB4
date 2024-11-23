package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 12;
        b++; // POST increment --- >  b = b + 1; --- > b = 13;
        System.out.println(b);
        ++b; // PRE increment  --- >  b = b + 1; ---- > b = 14;
        System.out.println(b);

        b--; // POST decrement --- > b = b - 1;  ---- > b = 13;
        System.out.println(b);
        --b; // PRE decrement --- > b = b - 1;  ----- > b = 12;
        System.out.println(b);


        System.out.println(b++); // POST increment
        // 2 actions
        //      print   --- >  b = 12;
        //      update  --- >  b = 13
        System.out.println(b);

        System.out.println(++b);  // PRE increment
        // 2 actions
        //    update    --- > b = 14;
        //    print     --- > b = 14;
        System.out.println(b);


        System.out.println(--b); //PRE decrement
        // 2 actions
        //      update -- > b = 13;
        //      print  -- > b = 13

        --b; // b = b - 1; --- > b = 12;
        System.out.println(--b); // PRE decrement
        // 2 actions
        //      update -- >  b = 11;
        //      print   -- > b = 11

        System.out.println(b--); // POST decrement
        // 2 actions
        //      use --- >  11
        //      update - > 10
        b--;   // b = b - 1; --- > 10 - 1 = 9
        System.out.println(b);


    }
}

