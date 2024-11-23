package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day = key.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = key.next();


        System.out.println("Enter your last name: ");
        String lastName = key.next();

        key.nextLine(); // TO handle the ENTER issue

        System.out.println("Enter you address: ");
        String address = key.nextLine();

        // RULE with .nextLine --- > if there are ANY OTHER Scanner methods than .nextLine() right before .nextLine(), we need handle it with extra .nextLine();

        System.out.println("Please, enter Job titles: ");
        String jobTitles = key.nextLine();

        System.out.println("Please, enter couple names: ");
        String names = key.nextLine();

        System.out.println("Enter your fav num: ");
        int favNum = key.nextInt();

        key.nextLine(); // TO handle the ENTER issue from the non-nextLine method --- >  key.nextInt();

        System.out.println("Enter, couple words");
        String coupleWords = key.nextLine();




    }
}
