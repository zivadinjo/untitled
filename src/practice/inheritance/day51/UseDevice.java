package practice.inheritance.day51;

public class UseDevice {
    public static void main(String[] args) {

        TV obj1 = new TV("Samsung","CX7800",1265.25,true);
        Phone obj2 = new Phone("Apple","iPhone",1025,true);
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.useDevice();
        obj2.useDevice();


    }
}
