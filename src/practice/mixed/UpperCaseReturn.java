package practice.mixed;

public class UpperCaseReturn {
    public static void main(String[] args) {


//        Write program that returns true if the total number of uppercase
//        characters are equal to total number of lowercase characters of a
//                string
//
//        Ex:
//        str = "JAVA java";
//
//        output:
//
//        true

        String str = "JAVA java";
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper++;

                upper += letter;
            }else {
                Character.isLowerCase(letter);
                lower++;
            }
        }





    }
}
