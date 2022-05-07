package day_55_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{

    @Override
    public void wear() {
        System.out.println("Wearing jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting a jacket");
    }
}
