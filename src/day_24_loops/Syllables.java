package day_24_loops;

public class Syllables {
    public static void main(String[] args) {

        String s = "ja-va";

        int syllables = 1;

        for (int i = 0; i< s.length(); i++){

            if (s.charAt(i) == '-'){
                syllables++;
            }
        }
        System.out.println("Syllables "+ syllables);

    }
}
