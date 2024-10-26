package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'A';
        char letter2 = 'l';
        char letter3 = 'i';
        char letter4 = 'n';
        char letter5 = 'a';

        // CONCATENATION
        System.out.println(letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);

        System.out.println();

        // ADDITION
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);
        System.out.println(0 + letter4);
        System.out.println(0 + letter5);

        System.out.println();

        // ADDITION
        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5);

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5;
        System.out.println(myName);
    }
}
