package day_05_variables;

public class CellPhone {
    public static void main(String[] args) {


        String brand = "apple";
        String model = "iPhone";
        String color = "black";
        double price =  1000.99;
        int storage =  128;

        boolean hasCamera = true;

        char sim = 'A';

        System.out.println(brand +" "+ model+" " + color+" " + price+"$"+" " +" "+ storage);

        System.out.println(hasCamera);
        System.out.println(sim);

        //aproach 2 with string variable

        String fullMessage = brand +" "+ model+" " + color+" " + price+"$"+" " +" "+ storage+hasCamera+sim;

        System.out.println(fullMessage);




    }
}
