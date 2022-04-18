package day_18_string;

public class RecapMethods {
    public static void main(String[] args) {

        String word = "pen";

        String word2 = new String("pen");

        System.out.println("Compare with == " + (word == word2));
        System.out.println("Compare with .equals() " + (word.equals(word2)));

        System.out.println(word.equals("Pen"));// Case sensitive
        System.out.println(word .equalsIgnoreCase("Pen")); // .equalsIgnoreCase igmores uper and lower case while comparing,ignoring case sensitivity

        int len = word .length();
        System.out.println(len);

        if (word.length()> 4){
            System.out.println("long word");
        }else {
            System.out.println("short word");
        }


    }
}
