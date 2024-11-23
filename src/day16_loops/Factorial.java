package day16_loops;

public class Factorial {
    public static void main(String[] args) {

        // n! = n * (n-1) ........ n == 1
        // 4! = 4 * 3 * 2 * 1 --- >  24
        // 5! = 5 * 4 * 3 * 2 * 1 -- >  120

        int num = 5;
        int result = 1;

        while (num > 0) {
            result = result * num;  // result = 1 * 4   | result = 4 * 3    | result = 12 * 2       | result = 24 * 1
            num--;                  // num = 3          | num = 2           | num = 1               | num = 0
        }

        System.out.println(result);

    }
}

