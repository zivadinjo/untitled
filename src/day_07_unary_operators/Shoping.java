package day_07_unary_operators;

public class Shoping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("We pick up 1 water");
        System.out.println("How many items in cart: "+ ++numberOfItems); // Preincrement the number of items increases right away
        price = price+2.5;

        System.out.println("We pick up 2 eggs");
        System.out.println("How many items in cart: "+ ++numberOfItems);
        System.out.println("How many items in cart: "+ ++numberOfItems);

        System.out.println(numberOfItems);

    }
}
