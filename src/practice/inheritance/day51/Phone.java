package practice.inheritance.day51;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }

    @Override
    public void useDevice() {
        System.out.println("Using phone");
    }
}
