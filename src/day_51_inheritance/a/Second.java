package day_51_inheritance.a;

public class Second {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
//        System.out.println(obj.four);
    }
}
// four is not accessible because is private