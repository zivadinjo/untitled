package day_54_abstraction.animal;

public final class Parrot extends Bird implements Flyable{

    @Override
    public void eat() {
        System.out.println("Parrot wobble over the seeds");
    }

    @Override
    public void fly() {

    }
}
