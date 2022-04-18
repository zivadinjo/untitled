package practice;


import java.util.Arrays;

public class Print {
    public static void main(String args[]) {

        String s = "I will find the lost book";
        String word = "";

        for (int index = s.length()- 1; index <=0;index--){
            word += s.charAt(index);
        }
        System.out.println(word);
    }
}

