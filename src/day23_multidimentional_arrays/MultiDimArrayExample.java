package day23_multidimentional_arrays;
import java.util.Arrays;

public class MultiDimArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10};         // Single dimensional array
        int [] m = {5, 10, 100, 39, 19};    // Single dimensional array


        int [][] all2 = {  {5, 10, 20, 10},  {5, 10, 100, 39, 19}  };
        int [][] all = {n, m};      // we stored SINGLE dimensional arrays in 2Dimensional array


        System.out.println(all); // HASHCODE -- > [[I@a09ee92 --- > memory location
        System.out.println(Arrays.toString( all ));// HASHCODE -- >  [[I@30f39991, [I@452b3a41]
        System.out.println(Arrays.deepToString( all )); // [[5, 10, 20, 10], [5, 10, 100, 39, 19]]


        System.out.println();

        int [][] arr2D = {
                {90, 80, 70},       // SINGLE dimensional array which has 3 elements -- index 0
                {60, 50, 40, 30},   // SINGLE dimensional array which has 4 elements -- index 1
                {20, 0, -10},       // SINGLE dimensional array which has 3 elements -- index 2
                {50}                // SINGLE dimensional array which has 1 element --  index 3
        };


        System.out.println(arr2D.length);
        System.out.println(arr2D[0].length);
        System.out.println(arr2D[1].length);
        System.out.println(arr2D[2].length);
        System.out.println(arr2D[3].length);
        // System.out.println(arr2D[4].length);  // ArrayIndexOutOfBoundsException

        System.out.println();
        // 40
        System.out.println(arr2D[1][2]);
        // System.out.println(arr2D[4][1]); // ArrayIndexOutOfBoundsException


        System.out.println();
        // arr2D[2] --- >
        System.out.println(Arrays.toString(arr2D[2]));



    }
}
