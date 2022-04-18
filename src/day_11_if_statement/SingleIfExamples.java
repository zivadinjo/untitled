package day_11_if_statement;

public class SingleIfExamples {
    public static void main(String[] args){

      if(false){
          System.out.println("Hello World");// It doesn't execute in this case print because if statement is false
      }

        System.out.println("Second Line");// Prints because it's not related to any conditions

        if(true){
            System.out.println("Today is Monday");
        }

        int score = 60;
        if(score >=75){
            System.out.println("Pass");
        }

        if(score < 75){
            System.out.println("Failed");
        }

        int year = 2022;
        boolean lockDown = year == 2020 || year == 2021;
        if(lockDown){
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");
        }

        if(!lockDown){
            System.out.println("Party");
            System.out.println("Travel");
            System.out.println("Still practice java");
        }








    }
}
