package day_16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numOne = input.nextDouble();
        System.out.println("Pick operator: + - * / %");
        String operator = input.next();
        System.out.println("Enter second number:");
        double numTwo = input.nextDouble();
        double result = 0;
        boolean validCalc = true;

        switch (operator) {
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Can not divide by 0");
                    validCalc = false;
                }
                break;
            case "%":
                if (numTwo != 0) {
                    result = numOne % numTwo;
                } else {
                    System.out.println("Can not take remainder of 0");
                    validCalc = false;
                }
                break;

            default:
                System.out.println(operator + " is not a valid number.");
                validCalc = false;

        }
        if(validCalc) {

            System.out.println(numOne + " " + operator + " " + numTwo + "=" + result);
        }
    }
}
