package day18_loops;

public class SwitchInLoop {
    public static void main(String[] args) {


        System.out.println("OPTION 1:  for loop with else if");
        for (int i = 0; i <= 5 ; i++) { // 0 ---- > 5

            // if i == 0 --- > print Zero
            // OPTION - 1
            if (i == 0){
                System.out.println("Zero");
            } else if (i == 1) {
                System.out.println("One");
            } else if (i == 2) {
                System.out.println("Two");
            } else if (i == 3) {
                System.out.println("Three");
            } else if (i == 4) {
                System.out.println("Four");
            } else {  // sicne the for loop is designed to be in the range of 0 to 5, and the code cover anything from 0 to 4, 5 is it only left part. So, just else is fine
                System.out.println("Five");
            }


        }


        System.out.println();
        System.out.println("OPTION 2:  for loop with switch");
        for (int i = 0; i <= 5; i++) {

            switch (i){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
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
                default:
                    System.out.println("Five");
            }

        }


    }
}
