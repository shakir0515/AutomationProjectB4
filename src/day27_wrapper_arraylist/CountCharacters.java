package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "aP24sdf%$ffseVSL243@#"; // ['a','P'... '#']

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numCount = 0;
        int otherCharCount = 0;


        for (char eachChar : str.toCharArray() ) {


//            if (eachChar >= 'A' && eachChar <= 'Z'){
//                upperCaseCount++;
//            } //.......


            if ( Character.isUpperCase( eachChar ) ){
                upperCaseCount++;
            } else if ( Character.isLowerCase( eachChar )) {
                lowerCaseCount++;
            } else if ( Character.isDigit( eachChar )) {
                numCount++;
            } else {
                otherCharCount++;
            }


        }

        System.out.println(upperCaseCount + " uppercase letters");
        System.out.println(lowerCaseCount + " lowercase letters");
        System.out.println(numCount + " numbers");
        System.out.println(otherCharCount + " others");


    }
}
