package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String str = "javaxa";
        //            012345

        System.out.println(str.indexOf("a"));               // 1
        System.out.println(str.lastIndexOf("a"));       // 5
        System.out.println(str.lastIndexOf('a'));       // 5

        System.out.println("------");
        String str2 = "cbacbecbocbacb";
        //             012345678910/11/12/13
        System.out.println(str2.indexOf("ac"));
        System.out.println(str2.lastIndexOf("ac"));

        System.out.println("------");
        System.out.println(str2.indexOf("ac", 4));              // 11
        System.out.println(str2.lastIndexOf("ac", 4));          // 2
        System.out.println("&" + str2.lastIndexOf("cb", 12));   // 12
        System.out.println(str2.lastIndexOf("cb", 11));         // 9
        System.out.println(str2.lastIndexOf("cb", 200));        // since it lastIndexOf method, my starting point is end, so anything matching starting from, will be the result.
        System.out.println(str2.lastIndexOf("ck", 200));        // -1


        System.out.println("------");

        System.out.println(str2.indexOf("cbecbocbacb"));
        System.out.println(str2.lastIndexOf("cbecbocbacb"));
        System.out.println(str2.lastIndexOf("cbecbocbacb", 2));
        // "loopcampo"

        //three 0
        //indexOf1stO -- > 1
        //indexOf2ndO -- > 2
        //indexOf3rdO -- > 8  ----- >  lastIndexof3rdO --- >  8
    }
}
