package day_64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {
//       Method with predicate created to verify is there duplicate numbers
        Predicate<Integer> verifyDuplicates = n -> {

            String str = n + "";
            String unique = "";

            for (int i = 0; i< str.length(); i++){ // the first time a number digit is found in our str String
                if(!unique.contains(str.charAt(i) + "")){
                    unique+= str.charAt(i);
                }else{
                    return true; // if the unique String has the number already, it means we have found it sometime before in the number already, which mean the digit is duplicate

                }
            }
            return false; // all digits were unique, so the else statement of the if was next run, which means no duplicates
        };

        System.out.println(verifyDuplicates.test(123));
        System.out.println(verifyDuplicates.test(1231));

        System.out.println();

//        Function that can return longest String from list of String

//        List<String> - parameter
//        , String - return type

        Function<List<String>, String> longestString = (list) -> {

            String longest = "";

            for (String each : list) {
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        System.out.println(longestString.apply(new ArrayList<>(Arrays.asList(
                "hello","apple","java","really long word", "small word"
        ))));

    }
}

/*

    if you wanted to make this one reusable:

        this is in main method, so it was local to only this class main method

        Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        ------------------

        defined the implementation in the class level, not the main method:


     class{

        public static Function< List<String>, String > longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        above is accessible by className.longestStringFromList


        }

 */