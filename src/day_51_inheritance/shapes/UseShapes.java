package day_51_inheritance.shapes;

public class UseShapes {
    public static void main(String[] args) {

        Square obj = new Square(4.5);
        System.out.println(obj);

        System.out.println(obj.area());
        System.out.println(obj.perimeter());


        Circle obj2 = new Circle(0.5);

        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());

    }
}
