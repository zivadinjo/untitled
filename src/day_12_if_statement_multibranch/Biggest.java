package day_12_if_statement_multibranch;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();




   //     int num1 = 10;
     //   int num2 = 20;
   //     int num3 = 30;


        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
        }


    }
}
