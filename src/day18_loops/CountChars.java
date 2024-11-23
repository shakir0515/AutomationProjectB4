package day18_loops;
/*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountChars {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4&";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numCount = 0;
        int otherCharCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (eachChar >= 'A' && eachChar <= 'Z'){
                upperCaseCount++;
            } else if (eachChar >= 'a' && eachChar <= 'z') {
                lowerCaseCount++;
            } else if (eachChar >= '0' && eachChar <= '9') {
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