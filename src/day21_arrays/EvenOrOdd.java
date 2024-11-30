package day21_arrays;
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
        Input: [4,1,3,12,5]
        Output:
            Even: 2
            Even Numbers: 4 12
            Odd: 3
            Odd Numbers: 1 3 5
 */
public class EvenOrOdd {
    public static void main(String[] args) {

        int [] nums = {4, 1, 3, 12, 5, 67};
        int countEven = 0;
        int countOdd = 0;
        String evenNums = "";
        String oddNums = "";


//        for ( int each : nums){
//
//            if (each % 2 == 0) {
//                countEven++;
//                System.out.println("Even: " + countEven);
//                System.out.println("Even Nums: " + each);
//            } else {
//                countOdd++;
//                System.out.println("Odd: " + countOdd);
//                System.out.println("Odd Nums: " + each);
//            }
//        }



        for ( int each : nums){

            if (each % 2 == 0) {
                countEven++;
                evenNums += each + " ";
            } else {
                countOdd++;
                oddNums += each + " ";
            }
        }

        System.out.println("Even: " + countEven);
        System.out.println("Even Numbers: " + evenNums);
        System.out.println("Odd: " + countOdd);
        System.out.println("Odd Numbers: " + oddNums);

    }
}