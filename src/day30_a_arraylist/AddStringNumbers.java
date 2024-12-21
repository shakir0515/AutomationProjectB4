package day30_a_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

/*
    String numbers to sum

    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
        Input:
        "123", "34", "513"

        Output:
        [ 6, 7, 9 ]
 */
public class AddStringNumbers {
    public static void main(String[] args) {

        ArrayList <String> numsAsString = new ArrayList<>();
        numsAsString.addAll( Arrays.asList( "123", "34", "513", "3456" ) );
        System.out.println("Original: " + numsAsString);

        System.out.println( sumOfElementsFromString(numsAsString) );

    }


    public static ArrayList <Integer> sumOfElementsFromString (ArrayList <String> numsAsString){ // ["123", "34", "513"]

        ArrayList <Integer> resultList = new ArrayList<>();


        for ( String each: numsAsString){       // "123"                                                     "34"                    "513"

            //System.out.println(each);           // "123" - > "1" + "2" + "3"
            //            1  +  2  +  3

            int sumOfAll = 0;
            for ( String eachLetter : each.split("")) { // ["1" + "2" + "3"]

                sumOfAll += Integer.parseInt(eachLetter); // "1" --- > 1 | "2" --- > 2 | "3" --- > 3

            }
            // sumOfAll -- >  6 | 7 | 9
            resultList.add(sumOfAll);


        }

        return resultList;
    }

}