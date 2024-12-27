package day27_wrapper_arraylist;
/*
    Google Search

        Toyota ---- > About 1,310,000,000 results (0.42 seconds)
        Honda  ---- > About 1,270,000,000 results (0.32 seconds)
        Mazda  ---- > About 605,000,000 results (0.38 seconds)
        ChatGPT --- > About 558,000,000 results (0.29 seconds)

        Task: go search something on the app, and check that the result comes back is lover than 0.5 sec
            - extract time value < 0.5
  */


public class GoogleSearch {

    public static void main(String[] args) {

        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";
        searchResultInfo =  searchResultInfo.replace("(", "").replace(")","");
        String [] resultInArr = searchResultInfo.split(" ");  // ["About", "558,000,000", "results", "0.29", "seconds"]
        String time = resultInArr[resultInArr.length-2]; // > [resultInArr.length-2 ]
        System.out.println(time);

        double time1 = Double.parseDouble(time); // Converts String to double (primitive)
        // Double time2 = Double.valueOf(time); // Converts String to Double (wrapper class object)


        if (time1 < 0.5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // We just did the code line below to practice teh TERNARY -- it does the same thing as if-else code above
        System.out.println( time1 < 0.5 ?  "Pass"  : "Fail");


    }

}