package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {

        boolean isRaining = true;
        int temperature = 76;

        boolean isGoodToWalk = !isRaining&&temperature>70;

        System.out.println("Is it good to walk for a walk: " + isGoodToWalk);
    }
}
