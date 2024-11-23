package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "loopcamp";

        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i));

        }
        for (int i = word.length()-1; i >= 0; i--) {

            System.out.print(word.charAt(i));

        }
    }
}
