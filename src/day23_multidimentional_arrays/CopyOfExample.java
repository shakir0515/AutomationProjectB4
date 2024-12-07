package day23_multidimentional_arrays;


    import java.util.Arrays;

    public class CopyOfExample {
        public static void main(String[] args) {
            int [] a = {1, 2, 3};   // size 3
            int [] b = a;           // size 3


            System.out.println(Arrays.toString( a ));
            System.out.println(Arrays.toString( b ));

            System.out.println();
            a[0] = 10;
            b[1] = 200;
            System.out.println(Arrays.toString( a ));
            System.out.println(Arrays.toString( b ));


            System.out.println();
            int [] x = new int[a.length];  // size 3
            System.out.println(Arrays.toString( x ));
            for (int i = 0; i <x.length; i++) {
                x[i] = a[i];
            }
            System.out.println(Arrays.toString( x ));



            System.out.println();
            a[0] = 100;
            System.out.println(Arrays.toString( a ));
            System.out.println(Arrays.toString( b ));
            System.out.println(Arrays.toString( x ));


            System.out.println();
            int [] y = Arrays.copyOf(a, a.length);
            System.out.println(Arrays.toString( y ));

            System.out.println();
            b[2] = 300;
            System.out.println(Arrays.toString( a ));
            System.out.println(Arrays.toString( b ));
            System.out.println(Arrays.toString( y ));


            System.out.println("---------------");
            int [] z = new int[a.length * 2];  // size 6
            System.out.println(Arrays.toString( z ));
            for (int i = 0; i < a.length; i++) { // 6
                z[i] = a[i]; // 0, 1, 2
            }
            System.out.println(Arrays.toString( z ));



            System.out.println();
            int [] z2 = Arrays.copyOf(a, a.length * 2);
            System.out.println(Arrays.toString( z2 ));

            System.out.println();
            z2[1] = 500;
            System.out.println(Arrays.toString( a ));
            System.out.println(Arrays.toString( z2 ));


            System.out.println();
            int [] z3 = Arrays.copyOf(a, a.length-1);
            System.out.println(Arrays.toString( z3 )); // 2



        }
    }

