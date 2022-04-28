package practice.inheritance.day51;

public class Fall extends Season{

    public Fall(String name,double highestAverage,double lowestAverage){
        super("Fall",75,64);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }

}
