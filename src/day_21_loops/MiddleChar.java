package day_21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcdef";

        int mid = s.length()/2;// variable to short the coding

        if (s.length() % 2 == 0) {
            // our word is even
            char firstMiddle = s.charAt(mid - 1);
            char secondMiddle = s.charAt(mid);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(mid - 1, mid + 1));


        } else {
            //our word is odd


            char middle = s.charAt(mid);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(mid, mid + 1));
        }

    }
}
