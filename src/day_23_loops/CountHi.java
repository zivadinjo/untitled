package day_23_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaaaahiahhhahihibcch";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println(count);

    }
}
