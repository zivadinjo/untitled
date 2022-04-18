package day_39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3};// we made Integer array because ArrayList doesnt accept primitive types
        Arrays.asList(arr);//convert the array to collection type(ArrayList)

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));// creating ArrayList with vaules from collection type
        System.out.println(nums);

        //Creating ArrayList with some initial values

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println(other);


    }
}
