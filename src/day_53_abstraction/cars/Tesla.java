package day_53_abstraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Card in the car,and press the button");
    }

    @Override
    public void charge() {
        System.out.println("Charging Tesla");
    }
}


/*

    the Tesla class is a sub classes of the ElectricCar class

    the ElectricCar class is abstract and the Tesla is not abstract (non-abstract)

    normal class(non-abstract) cannot have abstract methods

    so, we have to override any/all abstract method that were inherited


 */