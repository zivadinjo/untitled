package day_35_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int[] a = {1, 25, 37, 698, -258, 298};

        System.out.println(ArrayUtil.minNumber(a));
        System.out.println(ArrayUtil.maxNumber(a));
    }

}
