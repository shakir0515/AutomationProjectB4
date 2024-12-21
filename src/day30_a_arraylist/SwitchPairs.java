package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}

        There is two pairs:
            "Cat" and "in"
            "the" and "hat"

    Output:
        {"in", "Cat", "hat", "the"}
 */
public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList <String> list =  new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat" ));
        System.out.println("Original: " + list);

        System.out.println("Switched: " +  switchPairs(list) );

    }

    public static ArrayList <String> switchPairs (ArrayList <String> list){

        // "Cat", "in", "the", "hat", "Cat", "in", "the", "hat", "Cat", "in", "the", "hat"
        //   0      1     2      3      4      5     6      7      8      9     10     11

        ArrayList <String> switchedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i+1);
        }

        switchedList.addAll(list);

        return switchedList;
    }
}
