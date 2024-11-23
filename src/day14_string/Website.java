package day14_string;

import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a website: ");
        String websiteUrl = key.next().toLowerCase(); //www.google.com

        boolean isValidBeginning = websiteUrl.startsWith("www");
        // websiteUrl.equalsIgnoreCase("www");  // "www.google.com".equalsIgnoreCase("www")
        // System.out.println(isValidBeginning);
        boolean isValidEnd = websiteUrl.endsWith(".com") || websiteUrl.endsWith(".edu") || websiteUrl.endsWith(".gov") || websiteUrl.endsWith(".net") || websiteUrl.endsWith(".io");


        if (isValidBeginning && isValidEnd){
            System.out.println("It is valid website!");
        } else {
            System.out.println("It is not valid website");

            if (!isValidBeginning) {
                System.out.println("\tInvalid beginning");
            }

            if(!isValidEnd){
                System.out.println("\tInvalid ending");
            }

        }







    }
}
