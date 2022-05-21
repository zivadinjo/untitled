package day_61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        // keys are Integer , and values are String -> object type only no primitive types
        Map<Integer, String> map = new HashMap<>();
        // add key , value to the map
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); // HashMap order is random, not insertion order,not sorted

        // read key , value  from the map

        System.out.println(map.get(5)); // accepts key argument , and return value related to that key

        String value = map.get(10);

        map.remove(1); // remove method argument is the key, it removes the whole entry
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));


        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world"); // null key exists, so the value gets updates to hello world
        System.out.println(map);

        map.put(3, "March"); // 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);

    }
}
