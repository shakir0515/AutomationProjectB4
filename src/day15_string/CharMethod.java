package day15_string;
public class CharMethod {
    public static void main(String[] args) {
        // Num of chars       1234 --- > 4
        String str =         "loop";
        // INDEXs(location)   0123
        // In String, every single character has an INDEX


        System.out.println("Num of chars: " + str.length());

        // Since the .charAt(index); method returns char datatype value, we canNOT assign directly into String. But we can concate it with ""
        //String firstCharInStr = str.charAt(0);
        String firstCharInStr = "" + str.charAt(0);
        char firstCharInStr2 = str.charAt(0);  // since it returns SINGLE character, I can assign it into char datatype variable

        // what is the 1st character in str ?
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        // System.out.println(str.charAt(4)); // StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // After exception/error, the code will not execute anything after the line which causes the EXCEPTION/ERROR

        System.out.println("Hello");


        System.out.println();
        // what is the last character in str2 ?
        String str2 = "AL  DKlskdfjs;laskdjf;aldskjfa a;lsdkjfal;skjfa a;lskdjfal;ksdjfaieradvnas;r aivdslkfslcfnv;sjfna;kjn;sfvnlskdfjslkjdfhskjhfgkhjflskdvlskdnvlakhsda";
        //             0123456789......................................................................................................................................144
        System.out.println(str2.length());
        System.out.println(str2.charAt(115));

        System.out.println(str2.length() - 1);
        System.out.println(str2.charAt(  str2.length() - 1   ));


        // what is the 2nd last character in str2
        System.out.println(str2.charAt (  str2.length() -2  ));


        System.out.println();
        System.out.println("Number of characters in str2: " + str2.length());
        System.out.println("First character in str2: " + str2.charAt( 0 ));
        System.out.println("Last character in str2: " + str2.charAt( str2.length() - 1 ) );


        System.out.println();
        String str3 = "loop - camp";
        // INDEXs      012345678910
        System.out.println(str3.length());
        System.out.println(str3.charAt(4));




    }
}