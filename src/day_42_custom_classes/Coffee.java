package day_42_custom_classes;

public class Coffee {

    String brand;
    double price;
    double size;
    String type;

    public void drink(){
        System.out.println("Trying " + type + " coffee");
        size-=1.5;
    }

    public void refill(double amount){
        System.out.println("Refilling " + size + "oz of coffee");
        size+=amount;
    }

    @Override
    public String toString() {
        return
                "Brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", type='" + type + '\'';
    }
}