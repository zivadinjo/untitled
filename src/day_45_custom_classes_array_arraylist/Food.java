package day_45_custom_classes_array_arraylist;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = quantity * unitPrice;
    }

    public String toString() {
        return "Item: " + name + " ~ " + quantity + " x " + unitPrice + " for $" + totalPrice;
    }

}
