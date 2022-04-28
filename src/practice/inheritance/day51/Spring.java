package practice.inheritance.day51;

public class Spring extends Season{

    public Spring(String name,double highestAverage,double lowestAverage){
        super("Spring",85,60);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }

}
