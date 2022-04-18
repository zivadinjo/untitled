package day_07_unary_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int slicesOfPizza = 10;
        int numberOfPeople = 4;
        int slicesPerPerson = slicesOfPizza/numberOfPeople;
        int slicesLeft = slicesOfPizza%numberOfPeople;

        String report = "We ordered "+typeOfPizza+" pizza with "+slicesOfPizza+ " slices "+ numberOfPeople+" people ate"+slicesPerPerson+"each with "+ slicesLeft+" left over.";

        System.out.println(report);


    }
}
