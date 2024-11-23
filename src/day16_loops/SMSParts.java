package day16_loops;

public class SMSParts {

    /*
      [SMS parts]
      Given a String in the following format:
          “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}” 110-1

      Separate these parts and print them separately: Sender: actualSender
      Number: actualNumber Message: actualMessage”
   */
    public class SmsParts {
        public static void main(String[] args) {
            String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

            // java
            // 0123 --- length()-1
            // P1
            // substring(index1, index2); --- > message.substring (message.indexOf("<") + 1, message.indexOf(">")) ;
            // <James Bond>
            // index1 --- > message.indexOf("<");
            // index2 --- > message.indexOf(">");
            String part1 = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
            System.out.println(part1);

            // P2
            String part2 = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
            System.out.println(part2);

            // P3
            String part3 = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
            //String part3 = message.substring (message.indexOf("{") + 1, message.length()-1 ) ;  // this will do the same thing as above
            System.out.println(part3);


        }
    }
}