package day_11_if_statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temp = input.nextInt();// scanner version,gets dynamic value from console

        //int temp = 50;// hard coded version

        if(temp>=70){
            System.out.println("It's a nice day,go outside but with your laptop to code java.");
        }else{
            System.out.println("It's to cold. Code more java.");
        }



    }
}
