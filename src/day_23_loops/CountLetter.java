package day_23_loops;

public class CountLetter {
    public static void main(String[] args) {

        String str = "abbccaabbc";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a'){
                count++;
            }

        }

        System.out.println(count);


    }
}
