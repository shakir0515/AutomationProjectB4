package day14_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String word = "Saturday";
        //             01234567


        System.out.println(   word.substring(0)    ); // give me the portion starting from index 0 to the end --- > Saturday
        System.out.println(   word.substring(1)    ); // give me the portion starting from index 1 to the end --- > Saturday
        System.out.println(   word.substring(2)    ); // give me the portion starting from index 2 to the end --- > Saturday
        System.out.println(   word.substring(3)    ); // give me the portion starting from index 3 to the end --- > Saturday

        System.out.println("Sat" + word.substring(3)); // "Sat" + "urday" --- >  "Saturday";

        System.out.println();

        System.out.println(  word.substring(1,2)); // "a"
        System.out.println(  word.substring(0,3)); // "Sat"

        System.out.println();
        System.out.println(  word.substring(5, 8)); // 8 is not inclusive - stop before 8
        // System.out.println(  word.substring(5, 9)); // StringIndexOutOfBoundsException -- > 9 is not inclusive - stop before 9 -- > 8
        System.out.println(  word.substring(5));



    }
}
