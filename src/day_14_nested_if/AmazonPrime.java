package day_14_nested_if;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 25.99;
        boolean hasPrime = false;

        if(hasPrime){
            System.out.println("Eligible for 2 day shipping");
        }else {
            if (price >= 25) {
                System.out.println("Eligible for regular shipping");
            }else{
                System.out.println("Not eligible for free shipping. Shipping fee $ 3.99");
            }
        }





    }
}
