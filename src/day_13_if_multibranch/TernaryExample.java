package day_13_if_multibranch;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }
        System.out.println(evenOrOdd);

        String result = a % 2 == 0 ? "Even" : "Odd";//ternary- other way to write if statement
        System.out.println(result);

        System.out.println("--------------------------------");

        int num = 4;
        String posOrNeg;

        if (num > 0) {
            posOrNeg = "possitive";
        } else if (num < 0) {
            posOrNeg = "negative";
        } else {
            posOrNeg = "zero";
        }
        System.out.println(posOrNeg);


        String sign = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        System.out.println(sign);


    }
}
