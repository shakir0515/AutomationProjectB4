package day16_loops;

import java.util.Scanner;
/*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
 */
    public class Website {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please, enter a URL: ");
            String url = scan.next();  // www.google.com
            //012345678910

            url = url.substring(  url.indexOf(".")+1, url.lastIndexOf(".")  );
            //url.substring(  3, 10  );  ---- >  .google
            System.out.println(url);

        /*
            TODO: Home Practice
                Make sure that URL starts with www. AND ends with .com
                If not ---- > print "My code is not designed to handle your URL"
                If it is -- > do what the task says

         */

        }
    }
