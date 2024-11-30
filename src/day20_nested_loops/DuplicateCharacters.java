package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "applle";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            char eachLetterLoop1 = str.charAt(i);               // a                 p           p         l        l         e

            if (unique.contains(eachLetterLoop1 + "")) {           // ap
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                char eachLetterLoop2 = str.charAt(j);

                if (eachLetterLoop1 == eachLetterLoop2) {        // a-p-p-l-l-e      apple       apple     apple     apple    apple
                    count++;
                }

            }

            if (count > 1) {
                System.out.print(eachLetterLoop1);
            }


            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }


        }

    }
}