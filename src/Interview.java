
// String [] words = {"java", "selenium", "softskills", "mentors"};

//find shortest and longest word in given array return the
public class Interview {

    public static void main(String[] args) {
        String [] words = {"java", "selenium", "softskills", "mentors"};
        shortestAndLongestWord(words);
    }


public static void shortestAndLongestWord(String [] arr) {

        String longest = arr[0];
        String shortest = arr[0];

    for (String eachWord: arr) {
        if (eachWord.length()>= longest.length()){
            longest=eachWord;
        }
        if (eachWord.length()< shortest.length()) {
            shortest = eachWord;
        }
    }
    System.out.println("longest = " + longest);
    System.out.println("shortest = " + shortest);
}
}
