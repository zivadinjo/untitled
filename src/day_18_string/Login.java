package day_18_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter username: ");
        String username = input.nextLine();
        username = username.toLowerCase();

        System.out.println("Please enter the password: ");
        String password = input.nextLine();


        if (password.length()>=8 && username.equals("jamesbond")) {
            System.out.println("loged in "+ username);
        } else {
            System.out.println("Wrong password");
        }


    }
}
