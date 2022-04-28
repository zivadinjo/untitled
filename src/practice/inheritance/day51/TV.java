package practice.inheritance.day51;

public class TV extends Device {
    public TV(String brand,String model, double price, boolean wireless){
        super(brand,model,price,wireless);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }

    @Override
    public void useDevice() {
        System.out.println("Using TV");
    }
}

