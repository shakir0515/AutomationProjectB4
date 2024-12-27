package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 23, 65, 76};

        System.out.println( sum(arr) );                         // you can use array reference
        System.out.println(  sum(3, 4, 5, 34, 23)   );    // or you can use values directly in method calling as array
        System.out.println(  sum(3, 4, 5)   );                  // this will call the methods with matching parameters over var...args


        System.out.println();
        System.out.println(    contains(23, arr)   );
        System.out.println(    contains(23, 1, 3, 5, 23, 65, 76)   ); // 23, 1, 3, 5, 23, 65, 76

    }

    public static int sum (int n1, int n2, int n3){
        System.out.println("Test");
        return 0;
    }

    public static int sum (int ... arr){ // {1, 3, 5, 23, 65, 76};

        int total = 0;
        for ( int each : arr) {
            total += each;
        }

        return total;
    }


//    public static int sum (int [] arr){ // {1, 3, 5, 23, 65, 76};
//
//        int total = 0;
//        for ( int each : arr) {
//            total += each;
//        }
//
//        return total;
//    }



    public static boolean contains (int num, int ... arr){
        boolean result = false;

        for ( int each : arr) {
            if (each == num){
                result = true;
                break;
            }
        }

        return result;
    }

//    public static boolean contains (int ... arr, int num){  // var ... args HAS TO be LAST in the parameter
//        boolean result = false;
//
//        for ( int each : arr) {
//            if (each == num){
//                result = true;
//                break;
//            }
//        }
//
//        return result;
//    }



//    public static boolean contains (int num, int [] arr){
//        boolean result = false;
//
//        for ( int each : arr) {
//            if (each == num){
//                result = true;
//                break;
//            }
//        }
//
//        return result;
//    }



}
