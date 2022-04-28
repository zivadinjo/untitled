package practice.inheritance.day51;

public class Summer extends Season{

    public Summer(String name,double highestAverage,double lowestAverage){
        super("Summer",95.5,70.5);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }

}
