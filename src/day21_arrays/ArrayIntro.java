package day21_arrays;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
// Array -> data structure
// Array is an object

        // with primitive and non primitive(String, Scanner) data types
        // every element is index
        // size is fixed
        // only same data type

        String str1 = "Denver";
        //             012345
        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);


        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
        // System.out.println(str1.charAt(6));  // StringIndexOutOfBoundsException

        System.out.println();

        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "NewYork";
        String city4 = "Boston";

        int [] scores; // declare
        scores = new int [4]; // instantiate how many elements in declared array

        // This is just array declaration
        // String [] cities;

        // OPTION 1 - declare and assign values directly | 4 elements are added -- > size is 4
        String [] cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"};
        // String [] cities11 = {city1, city2, city3, city4}; // Instead hard coded values, we can use variables as well.

        // OPTION2 - Declare array with size only. This shows that it has 4 locations
        String [] cities2 = new String [4];


        // How do we access those elements - How can I access to EACH ELEMENT in the array
        System.out.println(  cities1[0]  );
        System.out.println(  cities1[1]  );
        System.out.println(  cities1[2]  );
        System.out.println(  cities1[3]  );
        // System.out.println(  cities1[4]  ); // ArrayIndexOutOfBoundsException


        System.out.println();
        System.out.println(  cities2[0] );  // when we create an array just with the size but not values added, it shows that location is there by empty. -> null
        System.out.println(  cities2[1] );
        System.out.println(  cities2[2] );
        System.out.println(  cities2[3] );
        // System.out.println(  cities2[4] ); // ArrayIndexOutOfBoundsException


        System.out.println();
        // How can I print all the elements
        System.out.println( cities1 );  // [Ljava.lang.String;@a09ee92 --- > We cant print array directly. It will show some memory location/hashcode
        System.out.println(Arrays.toString(  cities1 )); // [Chicago, Fairfax, NewYork, Boston] | Arrays class is used and it comes from java.util package -> .toString(); -> Returning me a STRING


        System.out.println();
        // How can I remove square bracket

        String arrayToString =  Arrays.toString(  cities1 ); // "[Chicago, Fairfax, NewYork, Boston]"
        System.out.println(arrayToString);

        arrayToString = arrayToString.substring(1, arrayToString.length()-1);
        System.out.println(arrayToString);

        arrayToString = arrayToString.replace(",", "");
        System.out.println(arrayToString);


        System.out.println();
        // How do I get how many elements I have --- > size
        String [] cities3 = {"Chicago", "Fairfax", "NewYork", "Boston", "Chantilly", "Falls Church"};
        System.out.println(   cities3.length   );


    }
}
