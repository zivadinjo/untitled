package day_09_scaner;

public class EligibleToVote {
    public static void main(String[] args) {

    String name = "James Bond";
    boolean areTheyCitizen = true;
    boolean doTheyHaveCriminalBackground = false;
    int age = 49;

    boolean isEligibleToVote = age>= 18 && areTheyCitizen && !doTheyHaveCriminalBackground;

        System.out.println(name + " is eligible to vote: "+ isEligibleToVote);



    }


}
