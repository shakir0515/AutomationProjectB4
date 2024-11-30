package day21_arrays;
/*
    Average Number from Array
    Given an int array calculate the average number ->Challenge: Make it flexible so it will work with any array size
    Examples:
    [1,2,3] -> average: 2
    [10, 15, 5, 6] -> average: 9
    [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */
public class AverageNumber {

    public static void main(String[] args) {
        int [] nums = {10, 15, 7, 3};
        double sum = 0;

        // OPTION 1 - fori loop
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum with fori: " + sum);
        System.out.println("Average with fori: " + sum / nums.length);

        // OPTION 2 - foreach loop
        sum = 0;
        for ( int each : nums){
            sum += each;
        }
        System.out.println("Sum with foreach: " + sum);
        System.out.println("Average with foreach: " + sum/nums.length);
    }
}