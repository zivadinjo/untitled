package practice.mixed;

public class DividingWithoutDivision {
    public static void main(String[] args) {

        int a = 150;
        int b = 3;
        int result = 0;

        while (a >= b){
            a = a-b;
            result++;
        }
        System.out.println(result);
    }
}
