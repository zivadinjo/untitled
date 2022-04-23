package day_51_inheritance.lyft;

public class LyftXL extends Lyft{

    public LyftXL(String driver){
        super(driver);
    }

    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles) * 1.1;
    }

}
// super.calculateRate(miles) -> calls the method in the parent class(Lyft class) and we multiply it by 1.1 to get 10% more