package day_37_wrapper_arraylist;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);
        numbers.add(50);// adding numbers to the end of array
        numbers.add(25);
        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
      //  System.out.println(numbers.get(30)); --> get you out of bounds, index doesn't exist in array

        //how do you know how many elements you have in array : arr.length
        //is .length method --> No

        System.out.println(numbers.size());




    }
}
