package day_32_arrays_multidimensional;

import java.util.Arrays;

public class AverageOfTraditionalLoop {
    public static void main(String[] args) {


        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double total =0;
        int totalLength = 0;

        for (int i = 0; i< nums.length;i++) {

            double sum = 0;

            for (int j = 0; j < nums[i].length; j++){
                sum+= nums[i][j];
            }

            System.out.println(Arrays.toString(nums[i])+ "the average is: " + (sum/ nums[i].length));
            total += sum;
            totalLength += nums[i].length;
        }

        System.out.println("Average of the whole 2D array: "+ (total/totalLength));



    }
}
