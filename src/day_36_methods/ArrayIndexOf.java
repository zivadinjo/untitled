package day_36_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {
        int [] arr = {12,5,1,5,2,65,5,6,};
        System.out.println(indexOf(arr,2));
        System.out.println(indexOf(arr,20));
        System.out.println(indexOf(arr,5));

        String [] words = {"java", "apple", "water", "hello"};

    }

    public static int indexOf(String [] str, String element){
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(element)){
                return i;
            }
        }

        return -1;
    }


    public static int indexOf(int [] nums, int element){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                return i;
            }
        }

        return -1;
    }

}
