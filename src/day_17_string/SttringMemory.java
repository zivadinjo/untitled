package day_17_string;

public class SttringMemory {
    public static void main(String[] args) {
        String first = "java"; // String literal,in String pool

        String second = new String("java"); // String object,not a string pool,but directly in the heap

        System.out.println(first == second);
        // == with String types gives you false. The == doesnat compare character,it compares memory location of object

        String third = "java";

        System.out.println(first == third);

        String fourth = "Java"; // at his line we have 2 objects in String pool : "java" and "Java"

        System.out.println(first == fourth);

        String fifth = new String("java");

        System.out.println(second == fifth);


    }
}
