package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new word";

        System.out.println(str.isEmpty());  // It has characters in it. So it is not empty
        System.out.println(str.length());

        str = " "; // reassign " " --- > into str container.
        System.out.println(str.isEmpty());  // It still has a character in it which is -- > "_"
        System.out.println(str.length());

        str = "";
        System.out.println(str.isEmpty());  // This time it is COMPLETELY EMPTY. not a single character in it.
        System.out.println(str.length());   //

        System.out.println(str.length() == 0 ? "There is no character" : "There are some characters");

        System.out.println("----------------");

        // str = "";  // ONLY CASE which will be tru for both
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        System.out.println("----------------");
        str = "Java is fun";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());


        System.out.println("----------------");
        str = "     "; // ONLY BLANK SPACE
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());


        System.out.println("----------------");
        str = " "; // ONLY BLANK SPACE
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());


        boolean isEmpty = str.isEmpty(); // Since it returns boolean, I can assign it into boolean variable
        boolean isBlank = str.isBlank(); // Since it returns boolean, I can assign it into boolean variable

    }
}