package day_57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();

            System.out.println("Enter number two");
            int num2 = input.nextInt();

            System.out.println(num/num2);

        } catch (InputMismatchException e) {
            e.printStackTrace();// show exemption message in the console when wrong input is given(string or char instead of number)
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {     // final block is optional code and is guaranteed to run no matter what
            System.out.println("FINAL BLOCK");
            input.close(); // proper way to close scanner
        }

        System.out.println("DONE");

    }
}
