package day25_methods;

import my_utilities.StringUtil;

/*
    Fix Format

    create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixedFormat {

    public static void main(String[] args) {
        fixFormat("MICKY");  // Micky
        System.out.println( fixFormat("MOUse") );

        String name = "TOM";
        String fixedName = fixFormat(name);
        System.out.println( fixedName );

        System.out.println(StringUtil.fixFormat("MOUse"));
    }


    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }


}