package day_58_exceptions;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");


        try {
            System.out.println(list.get(5));

            String s = null;
            s.toLowerCase();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }finally {
            System.out.println("Last line for the sleep try");
        }

        System.out.println(list);

        System.out.println();

        try{
            Thread.sleep(-3000);
        }catch (InterruptedException | IllegalArgumentException e){
            System.out.println("Wrong numbers");
            System.out.println(e.getMessage());
        }

    }
}
