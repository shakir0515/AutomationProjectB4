package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {
        ArrayList <String> groupOne = new ArrayList<>(); // capacity -> 10, size -> 0
        groupOne.add("Zakhar");
        groupOne.add("Yuliia");
        groupOne.add("Artem");
        groupOne.add("Roma");
        groupOne.add("Lenka");
        groupOne.add("Adi");
        groupOne.add("Nilufar");
        System.out.println(groupOne);

        ArrayList <String> groupTwo = new ArrayList<>();
        groupTwo.add("Pavlo");
        groupTwo.add("Steven");
        groupTwo.add("Ketevan");
        groupTwo.add("Ayaz");
        groupTwo.add("Kanan");
        groupTwo.add("Sammy");
        System.out.println(groupTwo);


        System.out.println();
        System.out.println("First person in Group one: " + groupOne.get(0));
        System.out.println("First person in Group two: " + groupTwo.get(0));

        System.out.println();
        System.out.println("Last person in Group one: " + groupOne.get(  groupOne.size()-1 ));
        System.out.println("Last person in Group two: " + groupTwo.get(  groupTwo.size()-1 ));


        System.out.println();
        for (int i = 0; i < groupOne.size(); i++) {
            System.out.println("Group one student " + (i+1) + ": " + groupOne.get(i));
        }

        System.out.println();
        int count = 1;
        for (String eachStudentName : groupTwo){
            System.out.println("Group two student " + count++ + ": " + eachStudentName);
        }

    }
}

