package day_24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {

        String s = "aaabbbcccccddddeee";
        String sub = "";
        String biggest = "";

        for (int i = 0; i < s.length() - 1; i++) {

            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)) {

                if (sub.length() > biggest.length()) {
                    biggest = sub;
                }
                sub = "";// reset the code for next substring!!
            }

        }
        System.out.println(biggest);

    }
}
