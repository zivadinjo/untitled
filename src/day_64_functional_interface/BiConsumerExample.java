package day_64_functional_interface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String , Integer> printNTimes = (str, n ) -> {

            for (int i =0; i< n ;i++){
                System.out.print(str + " ");
            }
            System.out.println();
        };

        printNTimes.accept("java" , 5);
        printNTimes.accept("selenium" , 7);

    }
}
