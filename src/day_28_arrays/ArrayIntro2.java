package day_28_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {


        double [] arr = new double[4];
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));
        arr[1]=12.55;
        arr[2]=10.20;
        arr[3]= 5 ;

        System.out.println(Arrays.toString(arr));

        //reassigning

        arr[2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double [5]; // creates new array with 5 element and reassign the arr reference to new object,and erases all data that was previously assigned to arr
        System.out.println(Arrays.toString(arr));








    }
}
