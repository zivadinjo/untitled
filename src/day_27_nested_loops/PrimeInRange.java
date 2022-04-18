package day_27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {

        int range = 50;

        for (int i = 2; i <= range; i++) {

            int counter = 0;

            for (int j = 2; j < i; j++) {


                if (i % j == 0) {
                    counter++;
                }


            }
            if (counter == 0) {

                System.out.print(i + " , ");

            }

            }


        }
    }
