package day13_string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");

        System.out.println(name1== name2);
        System.out.println(name1==name3);
        System.out.println(name2==name3);
    }
}
