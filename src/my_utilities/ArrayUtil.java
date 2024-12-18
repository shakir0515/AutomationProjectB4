package my_utilities;


import java.util.Arrays;

/**
 * This method returns the minimum value in the given int array
 */
public class ArrayUtil {
    public static int minNumInArr (int [] arr){
        int min = 0;
        Arrays.sort(arr); // [2, 23, 23, 345, 765, 1356, 2344]

        min = arr[0];

        return min;
    }


    /**
     * This method returns the maximum value in the given int array
     */
    public static int maxNumInArr (int [] arr){
        int max = 0;
        Arrays.sort(arr); // [2, 23, 23, 345, 765, 1356, 2344]

        max = arr[arr.length - 1];

        return max;
    }


    /**
     * This method returns boolean whether given int arr contains the given num
     * @param arr given array
     * @param num given num
     * @return boolean whether contains or not
     */
    public static boolean contains (int [] arr, int num){
        boolean result = false;

        for ( int each : arr) {
            if (each == num){
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * This method returns the index of given int num from the given int array
     * @param arr given int array
     * @param num given in value
     * @returns the index of value if exists, if not returns -1
     */
    public static int indexOf (int [] arr, int num){ // 78
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // {12, 34, 6, 78, 34, 9, 33};

            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }


    /**
     * This method returns the index of given String str from the given String array
     * @param arr given String array
     * @param str given in value
     * @returns the index of value if exists, if not return s-1
     */
    public static int indexOf (String [] arr, String str){ // "api"
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // "java", "selenium", "api", "db"

            if (arr[i].equals(str)) {
                index = i;
                break;
            }
        }
        return index;
    }


    /**
     * This method return the total sum of all the numbers in given int array
     * @param arr given int array
     * @returns the total sum of all elements
     */
    public static int sum (int ... arr){ // {1, 3, 5, 23, 65, 76};
        int total = 0;
        for ( int each : arr) {
            total += each;
        }
        return total;
    }


    /**
     * This method returns int array with given int element added at the end of the given int array
     * @param arr given int array
     * @param num given int element
     * @returns int array
     */
    public static int [] addElemInArr (int [] arr, int num) {

        int [] addedArr = Arrays.copyOf(arr, arr.length + 1); // {1, 2, 3, 4, 5, _ };
        addedArr [addedArr.length - 1] = num;

        return addedArr;
    }


    /**
     * This method returns int array with given int var args elements added at the end of the given int array
     * @param arr given int array
     * @param arr2 given int var args elements
     * @returns int array
     */
    public static int [] addElemInArray (int [] arr, int ... arr2 ) {

        int [] addedAr = Arrays.copyOf(arr, arr.length + arr2.length);  // {1, 2, 3, 4, 5,  _, _, _,.......}


        for (int i = arr.length, j = 0; i < addedAr.length; i++, j++) {   // i < 9  --- >  i = 5, j = 0;  i < 9; i++, j++
            addedAr[i] = arr2[j];
        }

        return addedAr;
    }

    /**
     * TODO: add the version of (method overloaded) the above two method fro String
     */

}
