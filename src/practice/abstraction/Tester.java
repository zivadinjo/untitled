package practice.abstraction;

public class Tester extends Employee{
    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    @Override
    public void hobby() {
        System.out.println("My hobby is coding");
    }
}
