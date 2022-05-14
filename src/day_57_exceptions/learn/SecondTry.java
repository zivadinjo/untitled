package day_57_exceptions.learn;

public class SecondTry {
    public static void main(String[] args) {

        try{

            String s = null;
//            String s = "java";
            System.out.println(s.length());

            int [] a ={1,4,5,2,};
            System.out.println(a[10]);

        } catch (NullPointerException e){
            System.out.println("Caught null pointer exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array index out of bounds");
        }

        System.out.println("Done");

    }
}
