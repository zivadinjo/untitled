package day_37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {

    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";
        int upper = 0;
        int lower = 0;
        int number = 0;
        int other = 0;
        String upperCase = "";

//        for (int i = 0; i < str.length(); i++) {
//            char letter = str.charAt(i);
//
//            if (letter >= 'A' && letter <= 'Z') {
//                upper++;
//            } else if (letter >= 'a' && letter <= 'z') {
//                lower++;
//            } else if (letter >= '0' && letter <= '9') {
//                number++;
//            } else {
//                other++;
//            }
//        }
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper++;
                upperCase += letter;
            } else if (Character.isLowerCase(letter)) {
                lower++;
            } else if (Character.isDigit(letter)) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("Upper " + upper);
        System.out.println("Uppercase letters: " + Arrays.toString(upperCase.toCharArray()));
        System.out.println("Lower " + lower);
        System.out.println("Numbers " + number);
        System.out.println("Others " + other);
    }
}
