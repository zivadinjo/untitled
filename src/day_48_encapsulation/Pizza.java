package day_48_encapsulation;

public class Pizza {

    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {

            this.size = size;
        }
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings >= 0) {
            this.numberOfToppings = numberOfToppings;
        }
    }

    public double calculatePrice() {
        double price = size.equalsIgnoreCase("smal") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8;
        return price + (numberOfToppings * 0.75);
    }

    @Override
    public String toString() {
        return "Pizza size" + size + ", number of toppings=" + numberOfToppings + ", price : $ " + calculatePrice();
    }
}
