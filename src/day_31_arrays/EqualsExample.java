package day_31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = a;

        System.out.println(a == b);// compare a array to b array,they are different object
        System.out.println(Arrays.equals(a, b));
        System.out.println(a == c);// compares a array to c array,they are same object
        //System.out.println(a.equals(b)); This method is not Arrays.equals()

    }
}
