package day23_multidimentional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        //int [] n = new int[4];

        String [][] groups1 = new String[4][]; // this 2D array will hold 4 single dimensional array
        // {{}, {}, {}, {}}
        String [][] groups2 = new String[4][3]; // this 2D array will hold 4 single dimensional array AND each will have 3 elements
        // {{_,_,_}, {_,_,_}, {_,_,_}, {_,_,_}}

        System.out.println(Arrays.deepToString(groups1));
        System.out.println(Arrays.deepToString(groups2));


        System.out.println("---------------------------------------");
        String [] group1 = {"Artem", "Diana", "Yuliia", "Roma"};
        String [] group2 = {"Pavlo", "Steven", "Ketevan"};

        String [][] mentorGroups = {group1, group2};

        System.out.println( Arrays.deepToString( mentorGroups ) );
        System.out.println( Arrays.toString( mentorGroups[0] ));
        System.out.println( Arrays.toString( mentorGroups[1] ));


        System.out.println("---------------------------------------");
        // I want to loop through 2D array and print single dimensional arrays
        for ( String [] eachArr : mentorGroups) {
            System.out.println( Arrays.toString( eachArr ));
        }

        System.out.println("---------------------------------------");
        // I want to get every single name for 2D arrays
        for ( String [] eachArr : mentorGroups) { // this will loop through 2D array and get each SINGLE dimensional array on each cycle.

            for ( String eachName : eachArr) {  // this will loop through each Single Dimensional array and get each element on each cycle.
                System.out.println(eachName);
            }

        }




    }
}
