package day_62_maps;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

        for(String key : store.keySet()){
            System.out.println("\tItem: " + key + " for $" + store.get(key));
        }

    }
}
