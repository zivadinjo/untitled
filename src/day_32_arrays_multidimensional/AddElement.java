package day_32_arrays_multidimensional;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] a = {100, 200, 300, 400};

        int[] z = Arrays.copyOf(a, a.length + 1);

        z [z.length - 1] = 100;

        System.out.println(Arrays.toString(z));


    }
}
