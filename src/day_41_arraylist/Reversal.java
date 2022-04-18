package day_41_arraylist;

import day_40_arraylist.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Reversal {
    public static ArrayList<String> reverseAll(ArrayList<String> list) {

        ArrayList<String> reverseWords = new ArrayList<>();

        for (String each : list) {
            reverseWords.add(StringUtil.reverse(each));

        }

        return reverseWords;

    }

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("Ted","Talk","Learn"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
    }

}
