package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "     loopcamp     ";
        System.out.println(str);
        System.out.println(str.length());

        System.out.println();
        str = str.trim(); // "_____loopcamp_____" --- > str = "loopcamp";
        System.out.println(str);
        System.out.println(str.length());


        System.out.println();
        String str2 = "    java is fun     ";
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.trim());
        System.out.println(str2);
        System.out.println(str2.trim().length()); // "    java is fun     " ->.trim()->   "java is fun" -> .length() -> 11


        System.out.println();
        String str3 = "\tThursday";
        System.out.println(str3);
        System.out.println(str3.length()); // Since tab is considered as ONE character ----- > it takes it as SINGLE char
        System.out.println(str3.trim().length());

    }
}
