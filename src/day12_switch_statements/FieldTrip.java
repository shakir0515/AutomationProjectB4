package day12_switch_statements;

import java.util.Scanner;

/*
    Have tree variables
        - grade
        - teacher
        - location
        - number of groups

        Based on the grade make a decision where the location is going to be and what the number of groups will be and who the teacher will be.
 */
public class FieldTrip {
    public static void main(String[] args) {

        int grade;
        String teacher;
        String location;
        int numOfGroups;

        Scanner key =  new Scanner(System.in);
        System.out.print("What is the grade you want to get a field trip info: ");
        grade = key.nextInt();

        // grade from 1 to 6 ----- > Mr. Nadir | Apple Orchard  | 3
        // grade 1 --- >
        // grade 2 --- >
        // grade 3 --- >
        // ....
        // all the other grades -- > Mr. Benjamin | Fire Works | 10

        if (grade >= 1 && grade <= 6) {

            if (grade == 1){
                teacher = "Ms. Jessica";
                location = "Zoo";
                numOfGroups = 4;
            } else if (grade == 2){
                teacher = "Ms. Casey";
                location = "Movie Theater";
                numOfGroups = 5;
            } else if (grade == 3) {
                teacher = "Mr. Tom";
                location = "Museum";
                numOfGroups = 7;
            } else if (grade == 4) {
                teacher = "Mr. Jerry";
                location = "Aquarium";
                numOfGroups = 9;
            } else if (grade == 5) {
                teacher = "Ms. Winnie";
                location = "Disneyland";
                numOfGroups = 2;
            } else {
                teacher = "Ms. Pooh";
                location = "Concert";
                numOfGroups = 3;
            }


        } else {
            teacher = "N/A";
            location = "N/A";
            numOfGroups = 0;
        }

        System.out.println("\nHere is field trip info for grade " + grade);
        System.out.println("\tTeacher Name: " + teacher);
        System.out.println("\tLocation: " + location);
        System.out.println("\tNumber of groups: "+ numOfGroups);



    }
}
