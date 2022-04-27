package day_52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

//    @Override -> cannot override static method,but we can declare this method and static method from parent class becomes hidden
    public static void staticMethod(){
        System.out.println("Static method from child class");
    }

}
