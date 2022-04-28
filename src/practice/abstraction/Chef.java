package practice.abstraction;

public class Chef extends Employee{
    @Override
    public void work() {
        System.out.println("Cooking 3 course meal");
    }

    @Override
    public void hobby() {
        System.out.println("Trying new food");
    }
}
