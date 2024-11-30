package day21_arrays;
/*
Initials
        • Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
            Ex:
            Input:
                [ "James Bond", "Eve Rell", "Anna Johnson" ]
            Output:
                JB ER AJ
 */
public class Initials {
    public static void main(String[] args) {

        String [] classmates = {" James Bond", " eve Rell", " Anna johnson"};
        System.out.println("I have " + classmates.length + " full names.");


        // FOR EACH
        for (String eachFullName : classmates){
            eachFullName = eachFullName.trim();
            // System.out.println(eachFullName); // "James Bond"
            String firstName = eachFullName.substring(0, eachFullName.indexOf(" ")).toUpperCase(); // James
            String lastName = eachFullName.substring(eachFullName.indexOf(" ")+1).toUpperCase(); // _Bond -- > Bond

            System.out.println(  ("" + firstName.charAt(0) + lastName.charAt(0)) );

        }


        /*
            TODO: Home Practice:
                Implement the same code with the use of FORI loop.
         */

    }
}
