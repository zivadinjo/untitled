package day_18_string;

import day_07_unary_operators.SalaryCalculator;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String msg = input.nextLine();
        msg = msg.toLowerCase();
        msg = msg.trim();

        if (msg.contains("java is bad") || msg.contains("have fun") || msg.contains("quit") || msg.contains("cry")) {
            System.out.println("Message failed to send");
        } else {
            System.out.println(msg + " Message sent");
        }


    }
}
