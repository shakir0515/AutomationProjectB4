package day03_comments_escape_sequence;

import javax.xml.stream.events.Comment;

public class Comments {

    public static void main(String[] args) {

        // Any comment will not run and compile by compiler

        //  #1 - Single line Comment
        //  The line below print a words "Loopcamp" and goes to the next line
        //  select the text, hold COMM and press forward slash, it will comment out portion of the code
        System.out.println("Loopcamp");

    /*
        #2 - Multiline Comment
        The following code is a PRINTLN statement
        It prints out "Java"
        Then it goes to the next line
     */
        System.out.println("Java");


//        System.out.prinrtln("Comment out");
//        System.out.prwintln("Test");
//        System.out.println("Check");
//        System.out.prwintln("Code");

        System.out.println("Valid code");

        // #3 Java DOC Comment

        /**
         * The following is println statement
         * It prints out "1st week of Java
         * This is written by QA team member: Alina
         */

        System.out.println("1st week of Java");

        // #4 TODO function - syntax is not case sensitive


// TODO: I need to find the amount how much i spent for the computer
        System.out.println("I recently got the computer for $...");

        /*

        TODO - can be used with JAVA DOC COMMENT

        TODO: Check how much you need to deposit
         */
        System.out.println("Deposit $... to my account");


    }


}
