package day_55_polymorphism.clothes;

public class StoreRunner {
    public static void main(String[] args) {

        TShirt tshirt = new TShirt(); // reference of itself
        tshirt.wear();


        Clothes tshirt2 = new TShirt();// reference of parent
        tshirt2.wear();


        Object tshirt3 = new TShirt();
//        tshirt3.wear(); -> Object class doesn't have reference to wear() method

//        HasHood tshirt4 = new TShirt(); -> not valid because Tshirt class does not implement hasHood interface

//        ____________________________________________
        System.out.println();
        // Reference of itself
        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();
        //Reference of super class
        Clothes jacket2 = new Jacket();
        jacket2.wear();
//        jacket2.putOnHood(); -> clothes reference does not have access to putOnHood() method

        Object jacket3 = new Jacket(); // reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class does not have reference to wear() or putOnHood() methods


        HasHood jacket4 = new Jacket();
//        jacket4.wear(); -> HasHood reference does not have visibility for wear() method
        jacket4.putOnHood();



    }
}
