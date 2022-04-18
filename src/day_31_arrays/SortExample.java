package day_31_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3, 6, 2, 68, 32, -2, 24};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Max and min from Array

        System.out.println("Min: "+nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);




    }
}
