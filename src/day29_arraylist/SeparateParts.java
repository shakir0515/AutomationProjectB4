package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABCD123$%#@456EFG!";
        ArrayList <String> list = new ArrayList<>( Arrays.asList( str.split("") ) ); // [A, B, C, D, 1, 2, 3, $, %, #, @, 4, 5, 6, E, F, G, !]
        //list.addAll(Arrays.asList( str.split("") ));
        System.out.println("Original: " + list);


        ArrayList <String> numList = new ArrayList<>(list);
        numList.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")); // keep all the matching ones and remove not matching
        System.out.println("Numbers: " + numList);


        ArrayList <String> specialList = new ArrayList<>(list);
        specialList.retainAll(Arrays.asList("~", "!", "$", "@", "#", "%", "^",  "&", "*", "(", ")", "{", "}", "[", "]", "?", "<", ">"));
        System.out.println("Specials: " + specialList);


        ArrayList <String> letters = new ArrayList<>(list);
        letters.removeAll(numList);
        System.out.println("Letters: " + letters);
        letters.removeAll(specialList);
        System.out.println("Letters: " + letters);





    }
}