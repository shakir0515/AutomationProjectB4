package day03_comments_escape_sequence;

public class Quotes {
    public static void main (String [] args){

        // Escape Sequence
        System.out.println("Everyone loves Java programming");

        /*
            Q: How if I want to print it with double quotes like below
            - Everyone loves "Java" programming
         */

        System.out.println("Everyone loves \"Java\" programming");
        System.out.println("\"Everyone loves Java programming\"");


        /*
            Q: since we use \ slash as part of the syntax, then how I print backward slash itself
            - There programming languages like java\python

            first backward slash is for the syntax
            second one is for the output text to be printed in the console
         */
        System.out.println("There programming languages like java\\python");

        /*
            Q: If I want to print out double backward slashes
            - There programming languages like java\\python
         */
        System.out.println("There programming languages like java\\\\python");


        // Forward slash does not require any ESCAPE SEQUENCE
        System.out.println("There programming languages like java/python");

    }

}
