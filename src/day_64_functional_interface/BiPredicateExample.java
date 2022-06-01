package day_64_functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer [], Integer> contains = (arr , num) -> {

            for (int each : arr) { // (Integer each : arr)
                if(each == num){   // if(each.equals(num))
                    return true;// if this if statement is every true, then my array does contain the number that we were looking for, so we return true
                }
            }
            return false;// if the loop finishes and compares the num with every number in the array, the array does not contain the num, returning false
        };

        Integer [] arr= {4,5,6,12,25,32,10};
        System.out.println(contains.test(arr,12));
        System.out.println(contains.test(arr,50));
        System.out.println(contains.test(arr,25));
        System.out.println(contains.test(arr,60));

        BiPredicate<String , String > anagram = (one , two ) -> {

            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            return Arrays.equals(oneArr , twoArr);

        };

        System.out.println(anagram.test("listen" , "silent"));

    }
}
