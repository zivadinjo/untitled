package day_12_if_statement_multibranch;

public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'P';

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("Lowercase");
        }
        if (letter >= 'A' && letter <= 'Z'){
            System.out.println("Upercase");
        }


    }
}
