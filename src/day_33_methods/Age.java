package day_33_methods;

import java.util.Scanner;

public class Age {
    public static void getAge(int birthYear){
        System.out.println("Your age is "+ (2022 - birthYear));
    }

    public static void main(String[] args) {
        getAge(1985);

        int year = 1990;
        getAge(year);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor birth year");
        getAge(input.nextInt());
    }


}

