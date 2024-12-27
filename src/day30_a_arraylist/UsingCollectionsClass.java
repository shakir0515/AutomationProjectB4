package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 2, 3, 4, 56, 34, 9)); // accept the params as var args you can provide the array there as well

        // .sort

        Collections.sort(list1);
        System.out.println(list1);

        // . reverse()
        Collections.reverse(list1);
        System.out.println(list1);

        // .max() .min()

        System.out.println(Collections.max(list1));
        int minInList = Collections.min(list1);
        System.out.println(minInList);

        // .swap()

        Collections.swap(list1, 1, list1.size()-1);

        // .frequency()
        // "loopcamp" --> o
        String str = "loopcamp";
        String [] strArr = str.split("");
        //ArrayList<String> letterList = new ArrayList<>(Arrays.asList(str));
        ArrayList <String> letterList = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(letterList);
        // find how many times I have "o" in it
        int numOfLetterO = Collections.frequency(letterList, "o");
        System.out.println(numOfLetterO);
        System.out.println(Collections.frequency(letterList,"p"));
        System.out.println(Collections.frequency(letterList,"a"));
        System.out.println();

        System.out.println(Collections.frequency(list1, 100));
        System.out.println(Collections.frequency(list1, 9));
    }
}
