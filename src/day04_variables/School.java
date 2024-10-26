package day04_variables;

public class School {

    public static void main(String[] args) {
        int numberOfStudInGrade1 = 45;
        int numberOfStudInGrade2 = 24;
        int numberOfStudInGrade3 = 34;
        int numberOfStudInGrade4 = 15;
        int numberOfStudInGrade5 = 23;

        int totalStudentNum = numberOfStudInGrade1 + numberOfStudInGrade2 + numberOfStudInGrade3 + numberOfStudInGrade4 + numberOfStudInGrade5;
        //System.out.println(totalStudentNum);

        double numOfDaysInAYear = 100.5;
        double numOfSnowDays = 12.5;
        double averageGpa = 2.6;

        System.out.println("Number of Students in Grade 1: " + numberOfStudInGrade1);
        System.out.println("Number of Students in Grade 2: " + numberOfStudInGrade2);
        System.out.println("Number of Students in Grade 3: " + numberOfStudInGrade3);
        System.out.println("Number of Students in Grade 4: " + numberOfStudInGrade4);
        System.out.println("Number of Students in Grade 5: " + numberOfStudInGrade5);

        System.out.println();
        System.out.println("Total Student Numbers in our School: \t" + totalStudentNum);
        System.out.println("Number of School Days: \t\t\t\t\t" + numOfDaysInAYear);
        System.out.println("Number of Snow Days: \t\t\t\t\t" + numOfSnowDays );
        System.out.println("Average GPA: \t\t\t\t\t\t\t" + averageGpa );
    }
}
