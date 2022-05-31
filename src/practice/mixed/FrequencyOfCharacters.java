package practice.mixed;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "abbccaabbc";

        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a'){
                countA++;
            }
            if (str.charAt(i)=='b'){
                countB++;
            }
            if(str.charAt(i) == 'c'){
                countC++;
            }

        }

        System.out.println("a " + countA);
        System.out.println("b " + countB);
        System.out.println("c " + countC);


    }
}
