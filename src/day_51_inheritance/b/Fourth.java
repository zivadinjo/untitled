package day_51_inheritance.b;

import day_51_inheritance.a.First;

public class Fourth extends First{

//    different class,different package with inheritance

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); // protected

    }
}
