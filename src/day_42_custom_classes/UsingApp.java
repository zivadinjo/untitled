package day_42_custom_classes;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();

        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

//        App.run(); -> not static method,instance method invalid calling of instance method

        System.out.println(cydeo.version);

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);

        new App().run();// this one creates new object with no reference and calls run method


    }
}
