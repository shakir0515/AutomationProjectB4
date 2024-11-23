package day12_switch_statements;

public class NumberInWords2 {
    public static void main(String[] args) {

        // only 5 data types, that works with switch  : String , char, int , short, byte
        int num = 1;    // 1 - 5 ---> it is not in the range of 1-5


// else if
        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Three");
        } else if (num == 3) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Not in the range 1-5");
        }

// switch case
        // no conditions - > only if matches exact values
        switch (num) {
            case 1:     // exact values - can't be duplicate
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:    // as else part "default" is - NOT required, BUT could be anywhere in a code; you don't need a break if DEFAULT IS LAST
                System.out.println("Not in the range 1-5");
        }
    }
}


