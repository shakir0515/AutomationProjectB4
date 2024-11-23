package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String sentence = "Wednesday is a good day. We hava java class   234     ";
        System.out.println(sentence);

        // METHOD chaining: combining multiple methods together
        // sentence = sentence.replace("234", ""); // Returns String -- > I can assign to String
        // System.out.println(sentence);


        //sentence = sentence.replace("234", "").trim();
        //System.out.println(sentence);

        sentence = sentence.replace("234", "");
        System.out.println(sentence);
        System.out.println(sentence.length());
        // Q: How long you can do teh METHOD CHAINING
        // A: As long as the method returns STRING, you can do METHOD CHAINING
        // NOT VALID --- > sentence.replace("234", "").length().trim();
        // NOT VALID --- > sentence.trim().charAt(0).length();
        // NTO VALID --- > sentence.trim().substring(4).substring(0,3).length().charAt(2);
        sentence = "Wednesday is a good day. We hava java class   234     ";
        sentence = sentence.replace("234", "").trim().substring(0, sentence.indexOf(".")).replace(" ", "-");
        System.out.println(sentence);


    }
}
