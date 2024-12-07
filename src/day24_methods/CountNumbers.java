package day24_methods;
/*

    starting from 0 count up to a certain number
    all the numbers until the number input

    method(5) --> 0 1 2 3 4 5

    method(10) --> 0 1 2 3 ... 10

 */
public class CountNumbers {
    public static void main(String[] args) {
        countUpToNum(5);
        countUpToNum(10);

        int a = 100;
        countUpToNum(a);

        countUpToNum(-10);
    }

    public static void countUpToNum(int num) {
        for (int i = 0; i <=num; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
