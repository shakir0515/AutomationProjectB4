package day25_methods;

import my_utilities.StringUtil;
import java.util.Arrays;

public class UsingStringUtil {
    public static void main(String[] args) {

        //Arrays.sort();
        System.out.println(StringUtil.fixFormat("jamES"));

        System.out.println(StringUtil.frequencyOfLetters("loopcamp", 'o'));


        System.out.println(StringUtil.reverse("loopcamp"));

    }
}