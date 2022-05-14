package day_57_exceptions.learn;

public class FourthTry {
    public static void main(String[] args)  {

        try {
            System.out.println("Start");
            Thread.sleep(2000);
            System.out.println("Finish");
        }catch (Exception e){
            e.printStackTrace();                // run if negative number is given at Thread.sleep
            System.out.println(e.getMessage()); // run if negative number is given at Thread.sleep
        }

    }
}
