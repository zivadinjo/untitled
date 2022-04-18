package day_24_loops;

public class CharactersInStrings {
    public static void main(String[] args) {

        String str = "java";

        for (int i = 0; i < str.length(); i++) {

            System.out.print((int) str.charAt(i) + " ");
        }

    }
}
