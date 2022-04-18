package day_33_methods;

public class CountNumbers {

    public static void numbersCount(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numbersCount(5);
        numbersCount(10);
        numbersCount(25);
    }
}
