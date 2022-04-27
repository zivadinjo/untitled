package day_52_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);
// a is hardcoded as 5, and b wil be assigned with creating new object,and cannot be reassigned
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

    }
}
