package day12_switch_statements;
public class SwitchExample {
    public static void main(String[] args) {

        int num = 5;

        switch (num){
            case 1:
                System.out.println("Before arithmetic operators applied: " + num);
                num *= num; // num = num * num; --- >  num = 5 * 5;  --- > num = 5;
                System.out.println("After arithmetic operators applied: " + num);
                break;
            case 5:
                System.out.println("Before modules applied: " + num);
                if (num % 2 == 0){
                    System.out.println("Even num");
                } else {
                    System.out.println("Odd num");
                }

        }

        System.out.println("--------------------------");

        int num2 = 6;
        if (num2 < 4) {
            System.out.println("Option 1");
        } else {

            switch (num) {
                case 4:
                case 5:
                case 6:
                    System.out.println("Number is between 4 and 6");
                    break;
                case 7:
                    System.out.println("number is 7");

            }
        }

    }
}

