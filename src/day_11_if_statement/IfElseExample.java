package day_11_if_statement;

public class IfElseExample {
    public static void main(String[] args) {

        int score = 50;
        if (score >= 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        int year = 2021;
        boolean lockDown = year == 2020 || year == 2021;
        if(lockDown){
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");
        }else{
            System.out.println("Party");
            System.out.println("Travel");
            System.out.println("Still practice java");
        }





    }

}
