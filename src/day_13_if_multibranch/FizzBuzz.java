package day_13_if_multibranch;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();


        if (n % 3 == 0 && n % 5 == 0){
            System.out.println("Fizz Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(n);
        }


    }
}
