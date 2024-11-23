package day07_relational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {

        int t = 100;

        int p = - ++t * t-- / t++ + --t; // 101 -> 100 -> 101 -> 100

        // p = '-' 101 '*' 101 '/' 100 '+' 100
        // p = -101 '*' 101 '/' 100 '+' 100
        // p = -101 * 101 / 100 '+' 100 -- >  -10201 / 100 '+' 100
        // p = -102 + 100 --- > -2
// ********************************************************************************
        //      - 101 * 101 / 100 + 100 = -10201 / 100 + 100 = - 102 + 100 = -2
        //              100   101

        System.out.println(t); //100
        System.out.println(p); //100


        /*
              1)      ++     --
              2)      -(making it negative)
              3)      *    /    %
              4)      +     -
         */
    }
}
