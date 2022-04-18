package day_18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "sNOw";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        String word2 = word + "WORLD";
        System.out.println(word2);

    }
}
