package day_41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNumbersFromString {
    public static ArrayList<Integer> sumFromString (ArrayList<String> list){

        ArrayList <Integer> sums = new ArrayList<>();

        for (String each : list){  // goes through every element of the ArrayList

            int currentSum = getCurrentSum(each);

            sums.add(currentSum);
        }

        return sums;
    }

    private static int getCurrentSum(String each) {
        int currentSum =0;

        for (String eachDigit : each.split("")){  // converting the String each in to an Array by split with empty space,which means each String will be separated with each character as separate as String element
            //"123" --> ["1" , "2" , "3"] and then you loop trough array

            currentSum+=Integer.parseInt(eachDigit);

        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList("123","1111","34"));
        System.out.println(sumFromString(list));

    }
}
