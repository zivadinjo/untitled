package practice.mixed;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeArrays {
//    public static void main(String[] args) {
//
//        int[] arr = {12, 55, 68, 23, 75, 3};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int[] reverse = new int[arr.length];
//        for (int i = arr.length - 1, j = 0; i >= 0; i--,j++) {
//            reverse [j] = arr[i];
//        }
//        System.out.println(Arrays.toString(reverse));
//    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2, 97, 2, 56, 46, 73, 6, 2, 3, 7));
        String s = "";

        for (int i =0; i <nums.size();i++){
            if (nums.get(i)>5){
                continue;
            }
            if (nums.get(i) % 2 == 0){
                s+="1";
            }else{
                s+="0";
            }
        }
        System.out.println(s);
    }
}