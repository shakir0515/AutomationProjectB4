package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a browser type: ");
        String browser = input.nextLine();

        System.out.println("What is the webpage you want to navigate to: ");
        String webpage = input.next();

        // Opening browser type

        switch (browser) {  // String, char, int, byte, short
            case "Chrome":
                System.out.println("Opening " + webpage + " in Chrome browser");
                break;
            case "Safari":
                System.out.println("Opening " + webpage + " in Chrome browser");
                break;
            case "Firefox":
                System.out.println("Opening " + webpage + " in Firefox browser");
                break;
            case "Opera":
                System.out.println("Opening " + webpage + " in Opera browser");
                break;
            case "Tor":
                System.out.println("Opening " + webpage + " in Tor browser");
                break;
            default:
                System.out.println("We do not have " + browser + " installed on this computer");
        }
    }
}
