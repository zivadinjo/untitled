package day_34_methodos;

import java.util.Scanner;

public class NumberWords {

    public static void main(String[] args) {

        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));

    }


    public static String numberAsWord(int num) {

        if (num < 1 || num > 10) {
            return num + " is invalid number";
        }

            String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

            return words[num - 1];
        }





}
