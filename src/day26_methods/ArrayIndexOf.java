package day26_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int [] numArr = {12, 34, 6, 78, 34, 9, 33};
        //                0   1  2   3   4  5   6

        String str = "Loopcamp";
        //            01234567
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 3));
        System.out.println(str.indexOf("o", 3, 5));

        System.out.println();
        System.out.println( indexOf(numArr, 78) );
        System.out.println( indexOf(numArr, 9) );
        System.out.println( indexOf(numArr, 90) );


        System.out.println();
        String [] word = {"java", "selenium", "api", "db"};
        //                  0          1        2      3

        System.out.println( indexOf(word, "api") );
        System.out.println( indexOf(word, "soft skills") );

    }


    public static int indexOf (int [] arr, int num){ // 78
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // {12, 34, 6, 78, 34, 9, 33};

            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOf (String [] arr, String str){ // "api"
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // "java", "selenium", "api", "db"

            if (arr[i].equals(str)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
