package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

// I will use this class as a RUNNER class ( with main() )
public class AllPeople {

    public static void main(String[] args) {

        // This is LOCAL variable
        // It is inside of METHOD
        String name2;

        // CanNOT use it directly because does not have initial value.
        // System.out.println(name);


        //These are not VALID way to reach not variable. Cannot directly access
        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(height);
        //System.out.println(isMarried);

        // Sample object creation we have seen so far.
        // Reference Side           =           Object Side
        Scanner key                 =           new Scanner(System.in);
        String str                  =           new String("Hello");
        ArrayList <String> list     =           new ArrayList<>();
        String [] strArr            =           new String[5];



        // Reference Side           =           Object Side
        Person person1              =           new Person();
        Person person2              =           new Person();
        Person person3              =           new Person();
        Person person4              =           new Person();
        Person person5              =           new Person();
        Person person6              =           new Person();
        Person person7              =           new Person();


        //Q: How can I access to those INSTANCE variables.
        //A: Need to create the object to access them.

        //String str2 = new String("Hello");
        //System.out.println(  str2.charAt(0)  );


        System.out.println("Person1 info:");
        System.out.println( person1.name );
        System.out.println( person1.age );
        System.out.println( person1.height );
        System.out.println( person1.isMarried );

        System.out.println();
        System.out.println("Person2 info:");
        System.out.println( person2.name );
        System.out.println( person2.age );
        System.out.println( person2.height );
        System.out.println( person2.isMarried );


        // Lets give Person1 some info
        person1.name = "Tom";
        person1.age = 30;
        person1.height = 6.1;
        person1.isMarried = true;


        // Lets give Person1 some info
        person2.name = "Winnie";
        person2.age = 25;
        person2.height = 6.2;
        person2.isMarried = false;




        System.out.println("------------------");
        System.out.println("Person1 info:");
        System.out.println( person1.name );
        System.out.println( person1.age );
        System.out.println( person1.height );
        System.out.println( person1.isMarried );


        System.out.println();
        System.out.println("Person2 info:");
        System.out.println( person2.name );
        System.out.println( person2.age );
        System.out.println( person2.height );
        System.out.println( person2.isMarried );


        System.out.println();
        System.out.println("Person3 info:");
        System.out.println( person3.name );
        System.out.println( person3.age );
        System.out.println( person3.height );
        System.out.println( person3.isMarried );

    }



}
