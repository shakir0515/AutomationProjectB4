package day17_loops;

public class ForLoopExample {

    public static void main(String[] args) {

        // initialization --- > int i = 0;
        // condition -------- > true/false
        // iteration -------- > cycles


        // for ( initialization; condition; iteration ){

        System.out.println("This is from \"fori\" loop");
        for ( int i = 0;  i <= 10; i++){
            System.out.println(i);
        }


        System.out.println();
        System.out.println("This is from \"while\" loop");
        int x = 0;
        while (x <= 10){
            System.out.println(x);
            x++;
        }

        System.out.println();
        System.out.println("This is from \"do-while\" loop");
        int y = 0;
        do{
            System.out.println(y);
            y++;
        }while (y <= 10);


    }
}