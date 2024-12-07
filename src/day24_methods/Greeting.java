package day24_methods;

import java.util.Scanner;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // String name = "Micky"; // "Jerry";
        // System.out.println("Hello " + name + "! How are you?");

        sayHello();
        sayHello2("Tom");
        sayHello2("Jim");
        String name = "Micky";
        sayHello2(name);
        String str = "James";
        sayHello2(str);

        Scanner key = new Scanner(System.in);
        System.out.print("What is you name: ");
        String userName = key.nextLine();

        sayHello2(userName);


    }


    public static void sayHello () {
        String name = "Tom"; // "Jerry";
        System.out.println("Hello " + name + "! How are you?");
    }

    // public, static, void (no return - do action), PARAMETERIZED method with ONE argument (String)
    public static void sayHello2 (String name) {
        //String name = "Tom"; // "Jerry";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello " + name + "! How are you?");
    }
}