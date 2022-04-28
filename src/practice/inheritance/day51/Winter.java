package practice.inheritance.day51;

public class Winter extends Season{

    public Winter (String name,double highestAverage, double lowestAverage){
        super("Winter", 42,30);
    }

    @Override
    public void activity() {
        System.out.println("Use fireplace");
    }

}
