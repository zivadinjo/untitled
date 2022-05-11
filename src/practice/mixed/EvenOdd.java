package practice.mixed;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        String strEven = "";
        String strOdd = "";
        int[] nums = {3, 16, 25, 184, 25, 33};


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {

                strEven += nums[i] + " , ";
            } else {

                strOdd += nums[i] + " , ";
            }
        }
        System.out.println(strEven);
        System.out.println(strOdd);
    }

}


