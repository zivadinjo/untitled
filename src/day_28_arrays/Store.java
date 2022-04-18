package day_28_arrays;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("Jackets")) {
                System.out.println("We have Jackests");
                inStock = true;
                break;
            }

        }
        if (!inStock) {
            System.out.println("Out of stock");
        }

    }
}
