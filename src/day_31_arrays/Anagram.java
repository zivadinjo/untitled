package day_31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char [] one = word1.toCharArray();
        char [] two = word2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one,two)){
            System.out.println("Is anagram");
        }else{
            System.out.println("Not an anagram");
        }


    }
}
