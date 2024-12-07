package day22_arrays;


import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] str = {"a", "b", "c"};
        System.out.println(Arrays.toString(str));

        System.out.println( String.join("-", str) );
        System.out.println( String.join("", str) );
        System.out.println( String.join("--------", str) );
        System.out.println( String.join("<>", str) );

        System.out.println(Arrays.toString(str));

        System.out.println();
        String result = String.join("*", str);
        System.out.println(result);
        result = result.replace("*", "");
        System.out.println(result);

    }
}
