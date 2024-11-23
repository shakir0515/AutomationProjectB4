package day07_relational_operators;

public class SignType {
    public static void main(String[] args) {
        int num = 23;

        boolean isPositive = num>0;
        boolean isNegative = num<0;
        boolean isZero = num==0;

        System.out.println(num + " is positive: " + isPositive);
        System.out.println(num + " is negative: " + isPositive);
        System.out.println(num + " is zero: " + isPositive);

    }
}
