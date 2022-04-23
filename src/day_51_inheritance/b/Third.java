package day_51_inheritance.b;

import day_51_inheritance.a.First;

public class Third {
//    different class,different package
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
    }
}
// four is private,only in same class is visible
//three is default,only in same package
//two is protected,can be visible only if its inherited,if is not inherited it's visible same as default until inherited