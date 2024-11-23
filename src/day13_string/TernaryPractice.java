package day13_string;

public class TernaryPractice {
    public static void main(String[] args) {

                // If the number is less than 10 and bigger than or equal -9, then print "number is single digit", else print "number is multi digit"
                int num = 1;
                // OPTION 1 - with IF-ELSE
                if (num < 10 && num >= -9) { // -78
                    System.out.println("Number is single digit");
                } else {
                    System.out.println("Number is multi digit");
                }

                System.out.println("---------------------");
                // OPTION 2 - with TERNARY
                System.out.println( (num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit" );


                System.out.println(num % 2 == 0 ? (num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit" : "TEST" );

                // ALWAYS try to find the CORRECT syntax if you have multiple ternary used together.
                // condition ? trueValue : falseValue


            }
        }

