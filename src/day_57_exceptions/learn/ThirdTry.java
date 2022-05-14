package day_57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();// show exemption message in the console when wrong input is given(string or char instead of number)
        }

        System.out.println("DONE");

    }
}
