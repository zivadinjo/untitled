package day_57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First Line");



        try{
            String word = "java";

            System.out.println(word.charAt(10));

        }catch (Exception e){
            System.out.println("Exception Happened");
        }

        System.out.println("Last LIne");

    }
}
