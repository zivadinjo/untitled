package day_10_scaner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");
        double ang1 = scan.nextDouble();
        double ang2 = scan.nextDouble();
        double ang3 = scan.nextDouble();

        boolean isTriangle = ang1+ang2+ang3 == 180;
        boolean isCircle = ang1+ang2+ang3 == 360;

        System.out.println("Is it triangle: " + isTriangle);
        System.out.println("Is it circle: "+ isCircle);

    }
}
