package day_24_loops;

public class CountingChars {
    public static void main(String[] args) {

        /*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
     */

        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                upper++;
            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if (letter >= '0' && letter <= '9') {
                num++;
            }


        }
        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lower characters: "+ lower);
        System.out.println("Number characters: "+ num);
/*String str="SDfddmla123";
        int upper=0;
        int lower=0;
        int number=0;
        String upperLetter="";
        String lowerLetter="";
        String numberChar="";

for(int i =0;i<str.length();i++ ){

            char letter=str.charAt(i);

            if(letter>='A' && letter<='Z'){
                upper++;
                upperLetter+=letter;
            }else if(letter>='a' && letter<='z'){
                lower++;
                lowerLetter+=letter;

            }else if (letter>='0' && letter <='9'){
                number++;
                numberChar+=letter;
            }
        }
        System.out.println("Upper case letter "+upper);
        System.out.println("Lower case letter "+lower);
        System.out.println("Number  "+number);
        System.out.println(upperLetter);
        System.out.println(lowerLetter);
        System.out.println(numberChar); */
    }
}
