package day24_methods;
/*

    all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the middle element/s
        length matters -> if even - there are two middle, for odd there is one middle

 */
public class OurArrayClass {
    public static void arrayLastElem (int [] arr){

        System.out.println("Last value in array: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        int [] num1 = {213, 45, 23, 65, 87, 98, 43}; // 7 elements -- > ODD
        //              0    1  2    3   4  5   6
        //                           num [num.length/2]
        int [] num2 = {54, 75, 5678, 234, 23, 54, 2, 55}; // 8 elements -- > EVEN
        //              0  1     2    3    4   5   6  7
        //                            num [num.length/2-1]
        //                            num [num.length/2]

        arrayFirstElem(num1);
        arrayLastElem(num1);

        System.out.println();
        arrayMidElems(num1);
        arrayMidElems(num2);

    }

    public static void arrayFirstElem (int [] arr) {
        System.out.println("First value in array: " + arr[0]);
    }


    public static void arrayMidElems (int [] num) {

        if (num.length % 2 == 0) {
            // num.length/2-1 (8/4 -1 )- > 3
            // num.length/2  (8/4) - > 4
            System.out.println("Middle First: " + num [num.length/2-1]);
            System.out.println("Middle Second: " + num [num.length/2]);
        } else {
            System.out.println("Middle: " + num [num.length/2]);
        }
    }
}
