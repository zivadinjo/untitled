package day_32_arrays_multidimensional;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};

        int[][] all = {n, m};
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));

        System.out.println();

        int[][] multi = {

                {10, 20, 30},
                {19, 51, 11, 49},
                {90, 29, 58},
                {14}
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);


    }
}
