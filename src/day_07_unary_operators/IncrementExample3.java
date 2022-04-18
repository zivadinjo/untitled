package day_07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i = 5;
        int z = i++;

        System.out.println(i);// i Is incremented when value on z is added,that's why value of i is 6,but because is post incrameted value of z stays 5.
        System.out.println(z);



    }
}
