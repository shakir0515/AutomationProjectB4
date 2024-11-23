package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {

        //break; continue;
        System.out.println("Traditional For Loop without break or continue");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("Traditional For Loop with break");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            break;
        }
        System.out.println();
        System.out.println("Traditional For Loop with break");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();
        System.out.println("Traditional For Loop with continue");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            continue;
           // System.out.println("Hi"); --> this line will never be reached because of continue

        }
        System.out.println();
        System.out.println("Traditional For Loop with continue");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i==5) {
                continue;
            }
            System.out.println("Hi");
        }

        System.out.println();
        System.out.println("Traditional For Loop with continue");
        for (int i = 1; i <= 10; i++) { // if number is ODD, continue to the next iteration

            //print only EVEN numbers
            if (i%2==1) {
                continue;       // SKIP this and continue
            }
            System.out.print(i + " ");

            }

        }


    }

