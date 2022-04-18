package day_34_methodos;

public class VoidVSReturn {

    public static void sayHello (){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        sayHello();
        //String msg = sayHello(); --> this doesn't work because the method is void
        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
    }

    public static String sayBye (){
        return "Bye";
    }







}
