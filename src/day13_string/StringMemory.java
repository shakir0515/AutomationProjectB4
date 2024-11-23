package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

        // String - > I don't need import  -> java.lang.String (it is imported by the default/automatically)
        // Scanner - > I have to import with java.util.Scanner


        // datatype (non-primitive /Object Type)
        // ClassName objectReferenceName
        Scanner key;
        String word;

        // datatype (primitive) variableName
        int num;

        //------------------------------------------
        // THERE are 2 OPTIONS that you can create a String

        // OPTION 1 - By LITERALS ---- >  simply by double quotes --- > ""
        String str1 = "java";


        // OPTION 2 - By new Keyword --- > new String ("");
        String str2 = new String ("java");



        String str3 = "java";

        String str4 = new String("java");


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("-----");
        System.out.println(str1 == str2); // false --- > memory location is different
        System.out.println(str2 == str3); // false --- > memory location is different
        System.out.println(str1 == str3); // true ---- > exact value by literals - so memory location is exact same
        System.out.println(str2 == str4); // false --- > by new keyword - memory location is different

        String str5 = "Java";
        System.out.println(str1 == str5); // false --- > by literals -- > since not matching values -- different memory locations


        // ==   ----- > with this relational operator, we compare the memory location not the value itself


    }
}