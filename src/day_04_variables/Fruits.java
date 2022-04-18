package day_04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples = 50;
        int bananas = 100;
        int grapes = 150;

        System.out.println("This is how many apples you have:" + apples);// Concatenation + alows to add letters to numbers
        System.out.println("Bananas:" + bananas);
        System.out.println("Grapes:" + grapes);

        System.out.println("Sold some apples");
        apples = 45; // Changing a variable,in this case number of apples,can be changed manually to each number,variable are used to be flexible

        System.out.println("Apples after selling: " +  apples);

        int price = 15;

        //System.out.println("The price of my 25 apples is $20"); This is hard coded,writen as sentance between quotations is hard coded,not variable
        System.out.println("The price of my " +apples +" apples is $20");


        System.out.println("The price of my apples "+ apples+ " is $"+ price);





    }









}
