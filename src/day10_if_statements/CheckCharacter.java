package day10_if_statements;
/*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */
public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'G';

        //  char letter declares a variable named "letter" of type char.
        //  assigning char value to char variable data type

//        if (97 <= letter && letter  <= 122) {
//            System.out.println("lower case letter");
//        }


        if ('a' <= letter && letter <= 'z') {
            System.out.println("lower case letter");
        }

        if ('A' <= letter && letter <= 'Z') {
            System.out.println("UPPER CASE LATER");
        }
    }
}
