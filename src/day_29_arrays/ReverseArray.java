package day_29_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

//             -----SECOND APPROACH------
//        for (int i = 0; i < arr.length; i++) {
//            reverse[arr.length-1-i] = arr[i];
//        }

        System.out.println(Arrays.toString(reverse));
        System.out.println(Arrays.toString(arr));


    }
}
