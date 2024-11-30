package day21_arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
    Make an array of your friends names

    asking how many friends do you have

    then ask for each friend's name one at a time, store all the names into an array

    at the end print your friend list
 */
public class FriendList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter how many fiends you have: ");

        String [] friendList = new String[  key.nextInt() ];  // 2 --- > [null, null]


        key.nextLine();  // handling ENTER issue
        for (int i = 0; i < friendList.length; i++) {

            System.out.print("Pleas, enter the name " + (i+1) + " : ");
            friendList[i] = key.nextLine();

        }



        System.out.println();
        // print your friend list
        //System.out.println(Arrays.toString(friendList));

        System.out.println("I have " + friendList.length + " friends. My Friend List:");

        for ( String eachName : friendList) {
            System.out.println("\t" + eachName);
        }
    }
}