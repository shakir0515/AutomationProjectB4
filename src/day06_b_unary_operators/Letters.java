package day06_b_unary_operators;

public class Letters {
    public static void main(String[] args) {

        char letter = 'G';

        //Q: Can I use Increment/Decrement with char ?
        //A: Yes, because each char has a number assigned to it.

        System.out.println(letter++); // POST -- > use then update -- > letter = letter + 1;  -- > letter = 71 + 1
        System.out.println(letter++);
        System.out.println(letter); // I
        System.out.println(++letter); // PRE -- > update then use -- > J



    }
}
