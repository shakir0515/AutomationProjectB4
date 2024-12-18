package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1);
        nums.add(30);
        nums.add(6);
        nums.add(20);
        nums.add(-10);
        nums.add(0);
        nums.add(3);

        System.out.println(nums);
        System.out.println(nums.size());

        /*
            .remove()
                    .remove(index);
                    .remove(Object);
         */

        /*
            Which element do you want you use?
            "I want to remove element: 3"

             "I want to remove element: 3"


         */

        System.out.println();
        String userAnswer =  "I want to remove element: 3";
        String numFormUserAnswer = userAnswer.substring( userAnswer.lastIndexOf(" ") + 1);
        System.out.println(numFormUserAnswer);

        int i1 = Integer.parseInt(numFormUserAnswer);
        Integer i2 = Integer.valueOf(numFormUserAnswer);

        nums.remove(3);  // removed it by int which is INDEX
        System.out.println(nums);
        nums.remove((Integer)3); // removed it by Integer which is OBJECT
        System.out.println(nums);

//        nums.remove(i1); // since i1 is int, it will remove the index.
//        nums.remove(i2); // since i2 is Integer, it will remove by Object

        //nums.remove(20); // IndexOutOfBoundsException
        //System.out.println(nums);


        nums.remove((Integer)20); // IndexOutOfBoundsException
        System.out.println(nums);

        nums.remove(Integer.valueOf("4")); // Integer.valueOf("4") --- > (Integer)4
        System.out.println(nums);
        nums.remove(Integer.parseInt("4")); // Integer.parseInt("4") --- > 4 --> int index
        System.out.println(nums);


        nums.remove(Integer.valueOf("40"));
        System.out.println(nums);

        // nums.remove(Integer.parseInt("40")); // IndexOutOfBoundsException
        // System.out.println(nums);






    }
}