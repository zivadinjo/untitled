package day_11_if_statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over
You do not have permission to send messages in this channel.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing?");
        double withdraw = input.nextDouble();

/*
        double balance = 100;
        double withdraw = 200;
*/
        balance -= withdraw;

        if (balance < 0) {
            System.out.println("Took to much money,$100 overdraft fee");
            balance -= 100;
        }
        System.out.println("Account balance: " + balance);


    }
}
