package day_59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add(null);
        set1.add("hello");
        set1.add("$4.5");
        set1.add("400");
        set1.add("hello");
        set1.add("%");
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
//      set2.add(null); --> null is not allowed in TreeSet
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello");
        set2.add("%");
        set2.add("WORLD");
        System.out.println(set2);

    }
}
