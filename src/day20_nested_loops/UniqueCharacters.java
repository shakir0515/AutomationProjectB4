package day20_nested_loops;
// IQ - Find the UNIQUE CHARACTERS

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AbbCD$CSTGF(ldslkfja;lskdnfa;dvsba";

        // Find the ONLY UNIQUE chars


        // OUTER LOOP
        for (int i = 0; i < str.length(); i++) { // AbbCD$CSTGF(
            int count = 0;
            char eachLetter1stLoop = str.charAt(i);


            // INNER LOOP
            for (int j = 0; j < str.length(); j++) {

                char eachLetter2ndLoop = str.charAt(j);  // AbbCD$CSTGF(

                if (eachLetter1stLoop == eachLetter2ndLoop){
                    count++;
                }

            }


            if (count == 1) {
                System.out.print(eachLetter1stLoop);
            }

        }



    }
}



// AAbCD$CSTGF(


// AAbCD$CSTGF(