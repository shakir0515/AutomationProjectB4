package day24_methods;
/*

            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30

 */
import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int[][] numbers = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };
        double totalSum = 0;
        int totalLength = 0;

        for (int[] eachArr : numbers) {
            int sumEachArr = 0;               // because we need to reset the sum each iteration and we are not using the sum out the loop
            //System.out.println(Arrays.toString(eachArr));
            for (int eachNum : eachArr) {
                // System.out.println(eachNum);
                sumEachArr += eachNum;
            }

            totalSum += sumEachArr;
            totalLength += eachArr.length;
            System.out.println("Average of " + Arrays.toString(eachArr) + " is: " + sumEachArr / eachArr.length);


        }
        System.out.println("Average of 2D array of " + Arrays.deepToString(numbers) + " is: " + totalSum / totalLength);
    }
}

