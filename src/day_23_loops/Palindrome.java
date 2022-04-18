package day_23_loops;

public class Palindrome {
    public static void main(String[] args){

        String str = "abcde";

        //reverse the string

        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--){

            reverse += str.charAt(i);// charchters are being read from the end and being added into reverse String
        }

        if (str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

        System.out.println(str.equals(reverse) ? "Palindrome" : "Not palindrome");

    }
}


