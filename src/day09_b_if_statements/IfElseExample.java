package day09_b_if_statements;

public class IfElseExample {

    public static void main(String[] args) {

        int point = 75;
        if (point >= 75) {
            System.out.println("You pass the exam");
        }

        if (point < 75) {
            System.out.println("You fail the exam");
        }


        System.out.println("--------------------------------");
        int score = 75;

        // if score is bigger than or equal to 75 ---- > You pass the exam
        // else print --- > You fail the exam
        if (score >= 75) {
            System.out.println("You pass the exam");
        } else {
            System.out.println("You fail the exam");
        }



        // if score is equal or bigger than 75 ----- > >=
        // if scores is bigger thatn 75 ------------ > >

        // if score is bigger than 75 ---- > print great
        if (score > 75) {
            System.out.println("great");
        }
        // if score is equal to 75   ----- > print good
        if (score == 75) {
            System.out.println("good");
        }
        // if score is less than 75  ----- > print bad
        if (score < 75) {
            System.out.println("bad");
        }
    }


}