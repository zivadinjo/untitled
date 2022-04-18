package day_47_encapsulation_modifiers;

public class UseTrafficLight {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("grey");
//        System.out.println(light.color);
//
//        light.color = "pink";

        TrafficLight light2 = new TrafficLight("red");

        System.out.println(light2.getColor());

        light.setColor("gray");

        System.out.println(light.getColor());

        TrafficLight light3 = new TrafficLight("Black");
        System.out.println(light3.getColor());

    }
}
