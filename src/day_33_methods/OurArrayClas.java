package day_33_methods;

public class OurArrayClas {

    public static void firstElement(int[] num) {
        System.out.println("First element " + num[0]);
    }

    public static void lastElement(int[] num) {
        System.out.println("Last element " + num[num.length - 1]);
    }

    public static void middleElement(int[] num) {
        if (num.length % 2 == 0) {
            System.out.println("First middle element " + num[num.length / 2 - 1]);
            System.out.println("Second middle element " + num[num.length / 2]);
        } else {
            System.out.println("Middle element" + num[num.length / 2]);
        }
    }
    public static void printArray(int [] num){
        String result = "START | ";

        for (int n : num){
            result += n+ "~";
        }
        result += " | END";
        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] numbers = {50, 100, 20, 25, 14, 18, 195, 200};
        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);

        printArray(numbers);


    }


}
