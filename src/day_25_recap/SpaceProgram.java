package day_25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine().trim();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                result += "_ ";
            } else {
                result += str.charAt(i) + " ";
            }

        }
        System.out.println(result);

    }
}
