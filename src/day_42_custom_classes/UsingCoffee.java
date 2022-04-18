package day_42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();

        coffee1.brand = "Lavaza";
        coffee1.price = 8.89;
        coffee1.size = 12;
        coffee1.type = "espresso";

        System.out.println(coffee1);

        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();

        coffee1.refill(4);

        System.out.println(coffee1);

    }
}
