package day25_methods;

import java.util.Scanner;

/*
    Ask a user to give you a number between 1 and 10
    and print the String version of given number
    Ex:
        5
        five

        0
        not valid

    But make it reusable!
 */
public class NumberWords {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number between 1 and 10: ");
        int userInput = key.nextInt(); // 3

        // void method
        //String str = numAsWord(userInput);        // since it is void method, cannot assign to anything
        //System.out.println(numAsWord(userInput)); // since it is void method, cannot use in print statement
        numAsWord(userInput);


        String str = numAsWord2(userInput);         // since it is RETURN method, can assign to variable.
        System.out.println( numAsWord2(userInput) ); // sinve it si RETURN method, can use in print statement
        numAsWord2(userInput); // Since, we do not use the returned value, this line of code will just call the method and will not do anything with returned value


    }


    /*
        1) void - return

            void  -- > there is NO value returning. One some action in the custom method body
            return - > there is VALUE returning. Need to USE (assign to variable, or print, or.....)


        2) parameterize - non-parameterized

            parameterized   --- > it will accept some input
            non-parameterized - > it will not accept any input
     */


    public static void numAsWord (int input) {

        String [] numsAsWord =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        //                         0      1       2       3        4      5        6       7       8        9

        // num < 1 || num > 10
        if (input < 1 || input > 10 ){
            System.out.println("Not valid");
        } else {
            System.out.println(numsAsWord[input-1]);
        }

//        This will do the same thing as above but we stored all values into ONE BIG CONTAINER - array, and used indexes
//        if (input == 1) {
//            System.out.println("One");
//        } else if (input == 2) {
//            System.out.println("Tow");
//        } else if (input == 3) {
//            System.out.println("Three");
//        }
//        //..... continue until 10
//        else {
//            System.out.println("Not valid ");
//        }





//        This is just to show that else-if can be done with switch statement as well
//        switch (userInput) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;   //..... continue until 10
//            default:
//                System.out.println("Not valid");
//        }

    }



    public static String numAsWord2 (int input){ // 3

        String [] numsAsWord =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        //                         0      1       2       3        4      5        6       7       8        9

        String result = "";

        // num < 1 || num > 10
        if (input < 1 || input > 10 ){
            result = "Not valid";
        } else {
            result = numsAsWord[input-1];
        }

        return result;
    }



}