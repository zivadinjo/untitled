package day_09_scaner;

public class OrPractice {
    public static void main(String[] args) {

        int apple = 5;
        int orange = 10;

        System.out.println(apple > 1 || orange < 10);
        System.out.println(apple > 10 || orange == 10);
        //false || true => true, only when 2 booleans are false when you use || result is false
        System.out.println(apple > 10 && orange == 10);
        //false && true => false, only when 2 booleans are true and you use && result is true




    }


}
