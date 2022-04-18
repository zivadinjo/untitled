package day_39_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0);
        System.out.println(item);// remove by first index in Arraylist,and returns removed value and if you store it in variable,you can call it any time
        System.out.println(list);

        boolean bool = list.remove("mouse");// remove object from arraylist directly,and returns boolean as value
        System.out.println(bool);
        System.out.println(list);


    }
}
