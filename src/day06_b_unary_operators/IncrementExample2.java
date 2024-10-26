package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {

        int age = 30;
        System.out.println(age);    //30
        System.out.println(age++);  // POST-INCREMENT -- > PRINT 30 -- > update > x = x + 1; -- > x = 31
        System.out.println(age);

        System.out.println(age++);  // POST-INCREMENT -- > PRINT 31 -- > update > x = x + 1;  -- > x = 32
        System.out.println(age++);  // POST-INCREMENT -- > PRINT 32 -- > update > x = x + 1;  -- > x = 33
        System.out.println(age);

        System.out.println(++age);  // PRE-INCREMENT -- > update > x = x + 1; -- > 34 --- > PRINT 34
        System.out.println(age);

        System.out.println(--age);  // PRE-DECREMENT -- > update > x = x - 1; -- > 33 --- > PRINT 33
        System.out.println(age);
        System.out.println(age--);  // POST-DECREMENT -- > PRINT 33 -- > update x = x - 1; -- > x == 32
        System.out.println(age);

        /*
            PRE
                - update then user
            POST
                - USE then update
         */

    }
}