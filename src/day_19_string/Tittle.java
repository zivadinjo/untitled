package day_19_string;

import java.util.Scanner;

public class Tittle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor name with tittles: ");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr ") || name.startsWith("mister ")) {
            System.out.println("Hello sir");
        } else if (name.startsWith("ms ") || name.startsWith("madam ")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr ")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith(" sr")) {
            System.out.println("Nice to see you Senior");
        }else if(name.endsWith(" jr")){
            System.out.println("Nice to see you Junior");
        }

    }
}
