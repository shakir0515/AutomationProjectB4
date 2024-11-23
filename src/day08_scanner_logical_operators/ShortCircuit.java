package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {

        int i = 10;
       // 1. increment / decrement

        // Difference between && vs & || vs |
        // SHORT CIRCUIT AND

        System.out.println(false && ++i > 5); // i = 10 , will remain the same because if first part is false it will skip the second part
        //                true && true --> true
        System.out.println(i);

        System.out.println("----");

        int y = 10;

        // Regular AND
        System.out.println(false & ++y > 5); // y = 11 , will update because will check both parts
        //                   true && true --> true
        System.out.println(y);

                System.out.println("----");

                int x = 10;
                System.out.println(true && ++x > 5);
                // Regular AND
                System.out.println(x);



            }
}
