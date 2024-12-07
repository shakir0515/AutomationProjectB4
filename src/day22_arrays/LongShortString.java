package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {
        String [] word = {"java", "selenium", "softskill", "mentors", "loop"};

        String longest = word[0];
        String shortest = word[0];

        for (String eachElement : word) {

            if (eachElement.length() >= longest.length()) {
                longest = eachElement;
            }
            if (eachElement.length() <= shortest.length()){
                shortest = eachElement;
            }
        }
        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String " + shortest);
    }
}
