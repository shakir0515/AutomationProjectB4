package day18_loops;
/*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
 */
public class CharactersInString {
    public static void main(String[] args) {
        String word = "java";

        for (int i = 0; i < word.length(); i++) {
            int asciiNum = word.charAt(i);
            System.out.println(asciiNum);
//            System.out.println(0 + word.charAt(i));  // this is doing the same thing
//            System.out.println( (int)word.charAt(i)); // this is doing the same thing

        }

    }
}
