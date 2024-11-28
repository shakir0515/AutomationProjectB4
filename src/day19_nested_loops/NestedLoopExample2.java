package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 1) i=0 A0 || 2) i=1 A1 || i=2 A2 || i=3 A3 || i=4 A=4

           // System.out.println("A" + i++);  //i use , print , and after increment

            System.out.println("A" + i);

            for (int j = 0; j < i; j++) {   // 1) 0<0 || 2) j=0 <i=1 ->B0 ; j++ ||    j=0 i=2 -> B0 -> j=1 <i2 || j=0 -> B0 j=0 ->B1 j=1->B2 || i=4 ; j=0 -> B0 B1 B2 B3
                System.out.println("B" + j);

            }

        }
    }
}
