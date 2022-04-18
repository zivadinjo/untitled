package day_25_recap;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("How many times you want to repeat the ending? ");
        int repeat = input.nextInt();

        for(int i = 0; i < repeat;i++){
            word += word.charAt(word.length() - 1);
        }

        System.out.println(word);




    }
}
