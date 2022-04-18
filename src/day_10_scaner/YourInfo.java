package day_10_scaner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is you favorite book? ");
        String book = scan.nextLine();

        System.out.print("What is your age? ");
        byte age = scan.nextByte();

        System.out.print("What is your favorite number? ");
        long num = scan.nextLong();

        System.out.println(book);
        System.out.println(age);
        System.out.println(num);



    }
}
