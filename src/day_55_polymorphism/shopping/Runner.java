package day_55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

        /*
        Shopping and OnlineShopping are abstract classes , so we can't make objects of them

        Shipping is interface,so we can't make object from it
         */


        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();
//        target.payForShipping(true); Target class does not implement the Shipping interface

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();


    }
}
