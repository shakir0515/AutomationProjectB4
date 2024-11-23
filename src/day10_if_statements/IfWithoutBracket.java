package day10_if_statements;

public class IfWithoutBracket {
        public static void main(String[] args) {

            if (5 < 1)
                System.out.println("Hi-1");

            System.out.println("Bye-1");

            // If without brackets --- you can ONLY have ONE statement that belongs to if
            if (15 > 7)
                System.out.println("Hi-2");

            System.out.println("Hi-3");

            System.out.println("------------");

            if (4 < 2) {
                System.out.println("loop-1");
            } else
                System.out.println("loop-2");
            System.out.println("loop-3");


            if (5 > 0)
                System.out.println("camp-1"); //this is belonged to else
            else
                System.out.println("camp-2"); // this is stand-alone print statement



        }
    }