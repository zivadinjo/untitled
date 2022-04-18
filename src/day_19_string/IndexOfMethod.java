package day_19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));

        System.out.println(s.indexOf("x"));// if the character doesn't exist in the string returns negative number one ( - 1 )

        System.out.println(s.indexOf("pe"));// when you are looking multiple characters gives you the value where the sequence starts

        System.out.println(s.indexOf("pz"));// -1 because the z letter doesn't exist in the code



    }
}
