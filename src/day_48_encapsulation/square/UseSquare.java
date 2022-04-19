package day_48_encapsulation.square;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);

        System.out.println(obj);

//        obj.side = 11; can't call the value like this because its private access

        obj.setSide(11);// setting value for private object trough setter

        System.out.println(obj.getSide());

        System.out.println(obj);

    }
}
