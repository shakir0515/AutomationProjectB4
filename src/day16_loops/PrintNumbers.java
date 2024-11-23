package day16_loops;

public class PrintNumbers {
    // INFINITE WHILE LOOP
    // while (true) {
    //    System.out.println("Hi!");
    // }

    public static void main(String[] args) {
    int num = 2;
        while (num <= 100) {
        System.out.println(num);
        num += 2; // num = num + 2;
    }

        System.out.println();
        System.out.println(num);




        System.out.println("----");
    int i = 1;
        while (i <= 100){
        // Instead of printing all number up until 100, print only even numbers
        if (i % 2 == 0){
            System.out.println(i);
        }
        i++;
    }




}
}

