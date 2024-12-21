package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList <Integer> nums1 = new ArrayList<>(Arrays.asList( 3, 54, 23, 76, 87, 34, 23, 7, 9));
        System.out.println("Original: " + nums1);

        ArrayList <Integer> nums2 = nums1;                      // nums2 points to the same object as nums1
        ArrayList <Integer> nums3 = new ArrayList<>(nums1);     // nums3 points to a different object which the copy of nums1


        nums3.removeIf( eachElement -> eachElement % 2 == 0 );
        System.out.println("Remove If: " + nums3);


        nums3.removeIf( each -> each < 10);
        System.out.println("Remove If: " + nums3);

        // .replaceAll()                        // [23, 87, 23]
        nums3.replaceAll( each -> each * 2);
        System.out.println("Raplace All: " + nums3);

        // The loop below is doing the same thing as above .replaceAll(); method.
        for (int i = 0; i < nums3.size(); i++) {
            nums3.set(i, nums3.get(i)*2);
        }
        System.out.println("For loop: " + nums3);


    }
}

