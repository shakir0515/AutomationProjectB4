package day11_if_satements;

public class NestedExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        if (a){                             // true
            System.out.println("1");
            if (b) {                        // false    - nested if statement
                System.out.println(3);
            }
        } else {                            // not going to check
            System.out.println("2 ");
        }


        if (d) {
            System.out.println(5);
        } else {
            System.out.println(6);
        }

    }

}
