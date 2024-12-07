package day22_arrays;

import java.util.Arrays;
/*

    Given a sentence
        today is monday

     reverse the sentence with words
        monday is today

 */
public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is monday";
        System.out.println(sentence);

        String [] sentenceArr = sentence.split(" "); // [today, is, monday]
        //                                                      0      1     2
        System.out.println("Before reverse: " + Arrays.toString(sentenceArr));


        System.out.println("------------------");

        String reversed = "";
        for (int i = sentenceArr.length-1; i >= 0; i--) {
            //System.out.println(sentenceArr[i]);
            reversed += sentenceArr[i] + " ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);

        // If you want to assign it into array
        String [] reversedArr = reversed.split(" ");
        System.out.println("After reverse: " + Arrays.toString(reversedArr));







    }
}