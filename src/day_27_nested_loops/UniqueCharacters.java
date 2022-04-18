package day_27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCDEEFYZZX";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char inner = str.charAt(j);

                   // letter            inner
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                                  // letter
                System.out.print(str.charAt(i));
            }
        }


    }
}
