package day_36_methods;

public class Picture {

    public static void draw(){
        System.out.println("Trying to draw");
    }

    public static void draw(String color){
        System.out.println("Draw with " + color);
    }

    public static void draw(String color, String color2){
        System.out.println("Drawing with " + color + " and with " + color2);
    }

    public static void draw(int size){
        System.out.println("Drawing with size " + size);
    }

    //not valid by just changing parameter name,but if you add two int parameter it would work
//  public static void draw(int size){
//        System.out.println("Drawing with size " + size);
//    }

    public static void draw(String color, int size){
        System.out.println("Color with size");
    }



}
