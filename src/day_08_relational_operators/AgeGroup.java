package day_08_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 80;


        boolean isKid = age <= 13;
        boolean isSenior = age>= 65;

        System.out.println("You are a kid: "+ isKid);
        System.out.println("You are a senior: "+ isSenior);


    }
}
