package day_46_static;

import day_47_encapsulation_modifiers.AccessModifier;

public class AccessOutsidePackage {

    // different class, different package

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        //System.out.println(obj.b);
        //System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        //System.out.println(AccessModifier.y);
        //System.out.println(AccessModifier.z);

        // c and z are not accessible outside the class because they were private,they are visible only in the same class where they are declared

        // b and y are default(they don't have access modifier),you can access them in the same class and same package

        // public are accessible in class,in the same package(different clas), and outside the package (different package,anywhere in the project)

    }
}
