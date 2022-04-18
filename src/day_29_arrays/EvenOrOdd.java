package day_29_arrays;

public class EvenOrOdd {
    public static void main(String[] args) {

        int [] nums = {4 , 1 , 3 , 12 , 5};
        int eveNum = 0;
        int oddNum = 0;
        String even = "";
        String odd = "";

        for (int i = 0; i< nums.length; i ++){
            if (nums[i] % 2 == 0){
                eveNum++;
                even += nums[i] + " , ";
            }else{
                oddNum++;
                odd += nums[i]+ " , ";
            }
        }
        System.out.println("even counter " + eveNum + " - even numbers "+ even);
        System.out.println("odd counter" + oddNum+ " - odd numbers"+ odd);



    }
}
