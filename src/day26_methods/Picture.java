package day26_methods;

public class Picture {

    // method ----- > is a code of block that does some function/action

    // CUSTOM METHOD
    // method is -- > public --- > available anywhere in whole project
    // method is -- > static --- > this method can be called by class name
    // method is -- > void   --- > in terms of what this method is returning, it is VOID method.
    // method is -- > non-parameterized --- > meaning nothing in parenthesis, no parameters in (), does not accept anything
    public static void draw() {
        System.out.println("Trying to draw");
    }


    // !!!!! CANNOT have 'same method name' + 'same ()' style -- > because when this method is called, java would not know which method to call.
    // 'method name' + '()' --- > METHOD SIGNATURE
    // public static void draw () {
    //    System.out.println("Trying to draw nicely");
    // }

    // This has a different METHOD SIGNATURE
    public static void draw(String color) {
        System.out.println("Trying to draw with " + color + " color.");
    }


    // The parameter variable name being different does not matter
    // The parameter variable's data type matters
    // NOT valid, since the one above has the same METHOD SIGNATURE

    // public static void draw (String clr2){
    //    System.out.println("Trying to draw with " + color + " color." );
    //}


    // This has a different METHOD SIGNATURE
    // This method accepts 2 parameters
    public static void draw(String color1, String color2) {
        System.out.println("Trying to draw with " + color1 + " and " + color2 + " colors.");
    }


    // This has a different METHOD SIGNATURE
    // This method accepts 3 parameters
    public static void draw(String color1, String color2, String color3) {
        System.out.println("Trying to draw with " + color1 + " and " + color2 + " colors.");
        System.out.println("I also like " + color3 + " color.");
    }


    // This has a different METHOD SIGNATURE
    // This method accepts 2 parameters - PAY attention to ORDER ot the parameters data types
    public static void draw(int num, String color) {
        System.out.println("Trying to draw with " + num + " different tones of " + color + " colors.");
    }


    // This has a different METHOD SIGNATURE
    // This method accepts 2 parameters - PAY attention to ORDER ot the parameters data types
    public static void draw(String color, int num) {
        System.out.println("Trying to draw with " + num + " different tones of " + color + " colors.");
    }


    // This has a different METHOD SIGNATURE
    // This method accepts 1 parameter - PAY attention to the parameters data types
    public static void draw(int num) {
        System.out.println("Trying to draw with " + num + " brushes");
    }


    // This has a different METHOD SIGNATURE
    // This method accepts 1 parameter - PAY attention to the parameters data types
    public static void draw(boolean isPainted) {
        System.out.println("This is already painted: " + isPainted);
    }


    // This has a SAME  METHOD SIGNATURE ( methodName + () )
    // This method accepts 1 parameter - PAY attention to the parameters data types
    // PAY ATTENTION TO THE return type -- > RETURN type does not mather for METHOD OVERLOADING
    //public static String draw (boolean isPainted){
    //    System.out.println("This is already painted: " + isPainted );
    //    return "";
    //}


    // This has a DIFFERENT  METHOD SIGNATURE ( methodName + () )
    // This method accepts 1 parameter - PAY attention to the parameters data types
    // PAY ATTENTION TO THE return type -- > still RETURN type does not mather for METHOD OVERLOADING
    public static String draw(double num) {
        System.out.println("This is already painted and sold for $" + num);
        return "";
    }


}
