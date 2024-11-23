package day09_b_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {

        // Single If statement -  with direct boolean values
        if (false) {
            System.out.println("1st print statement");
        }

        // println statement
        System.out.println("2nd print statement");


        // Single If statement
        if (true) {
            System.out.println("3rd print statement");
        }


        // Single if statements with relational operators which results in boolean --> true/false
        System.out.println("------------------");
        int score = 75;
        if (score >= 75) {
            System.out.println("You pass the exam");
        }

        if (score < 75) {
            System.out.println("You fail the exam");
        }


        // Single if statements with logical operators which results in boolean --> true/false
        System.out.println("------------------");
        int year = 2028; // 2019, 2020, 2021
        boolean isCovidQuarantineYear = year == 2019 || year == 2020 || year == 2021;
        // boolean isCovidQuarantineYear = year >= 2019 && year <= 2021;  // There is not one solution - implementation of the code can be different but the result can be same

        if (isCovidQuarantineYear){
            System.out.println(year + " was a covid quarantine year.");
        }

        if (!isCovidQuarantineYear) {
            System.out.println("It is not a covid year. Go out and enjoy");
        }

        if (isCovidQuarantineYear == false) {
            System.out.println("It is not a covid year. Go out and enjoy");
        }


    }
}