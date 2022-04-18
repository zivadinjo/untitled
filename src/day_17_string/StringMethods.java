package day_17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        // how to compare String values --> .equals()
        System.out.println(name.equals("james"));

        System.out.println("car".equals("dog"));

        System.out.println(name.equals("James"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));

        System.out.println(name.length());



    }
}
