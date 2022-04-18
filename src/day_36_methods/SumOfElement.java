package day_36_methods;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2};
        System.out.println(sum(arr));
    }


    public static int sum(int ... nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }
}

//             normal one
//    public static int sum (int [] nums){
//        int sum = 0;
//        for (int each : nums){
//            sum += each;
//        }
//        return sum;
//    }
//
//}
