package day28_arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    HTML Generator

    Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
 */
public class HtmlGenerator {
    public static void main(String[] args) {
        String str = "li^3";

        System.out.println( htmlGenerator(str) );
        System.out.println( htmlGenerator("div^7") );
        System.out.println( htmlGenerator("span^2") );

    }


    /*
        1. I would create a custom method
            - parameterize -- > (String str);
            -  if void ---- print
            -  if return -- String

        2. In custom method, build the implementation that does what the task is
            - String str = "li^4";
                - find a way to get -- > li
                - find a way to get -- > 3

                    - .substring(); + indexOf();
                    - .split("^");

             - <__></__>
               <__></__>
               <__></__>
               <__></__>



     */

    public static String htmlGenerator (String str) {

        String result = "";
        String [] arr = str.replace("^", " ").split(" "); // ["li", "3"]


        int numOfCycle = Integer.parseInt(arr[1]); // "3" -- > 3

        for (int i = 0; i < numOfCycle; i++) {  // 0 < "3";
            result += "<" + arr [0] + "></" + arr[0] + ">";        // <li></li>
        }

        return result;
    }

}
