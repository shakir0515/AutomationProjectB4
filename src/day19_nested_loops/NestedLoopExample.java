package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        // print "Hello Loopcamp!"
        System.out.println("Hello Loopcamp!");
        System.out.println("Hello Loopcamp!");
        System.out.println("Hello Loopcamp!");
        System.out.println("Hello Loopcamp!");
        System.out.println("Hello Loopcamp!");


        System.out.println("---------------");
        // with loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Loopcamp!");
        }

        System.out.println("*****************");
//        System.out.println("Hello Galaxy");
//        System.out.println("Hello Moon");

        /*
            Hello Galaxy
            Hello Moon
            Hello Moon

            Hello Galaxy
            Hello Moon
            Hello Moon

            Hello Galaxy
            Hello Moon
            Hello Moon

         */


//        Hello Galaxy
//        Hello Moon
//        Hello Moon


        for (int i = 1; i <= 3; i++) { // OUTER LOOP

            System.out.println("Hello Galaxy");
            for (int j = 1; j <= 100; j++) {  // INNER LOOP
                System.out.println("Hello Moon");
            }
            System.out.println();

        }

        // On every cycle of  OUTER LOOP - I have __ times INNER CYCLES
        System.out.println("---------------");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.println(10);
            }
            System.out.println();

        }

        // Every cycle of the OUTER loop, INNER loop happens 6 times



    }
}