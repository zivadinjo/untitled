package day_29_arrays;

public class ForEachLoopExample {
    public static void main(String[] args) {

        int [] nums = {30 ,12 ,159 , 20};

        for(int i = 0;i< nums.length;i++){
            System.out.println("traditional "+ nums[i]);
        }
        System.out.println();

        for(int element : nums){
            System.out.println("for each "+ element);
        }

        String [] classes = {"java" , "soft skils" , "selenium" , "database" , "api"};

        for (int i = 0; i< classes.length;i++){
            System.out.println("traditional "+ classes[i]);
        }

        for(String word : classes){
            System.out.println(word);
        }
        System.out.println();

        double [] prices = {20.3 , 15.17 , 410.23};
        for (double each : prices){
            System.out.println("$ "+each);
        }






    }
}
