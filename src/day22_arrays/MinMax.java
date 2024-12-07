package day22_arrays;

public class MinMax {
    public static void main(String[] args) {


        int[] nums = {500, 120, -80, 90, 250, -10};


        //int max = Integer.MAX_VALUE;
        int max = -2147483647;
        //int min = Integer.MIN_VALUE;
        int min = 2147483647;

        for (int each : nums) {

            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
