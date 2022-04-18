package day_13_if_multibranch;

public class IfWithouBrackets {
    public static void main(String[] args) {

        if (4>1)
            System.out.println("hello");
         if(4>10)
             System.out.println("bye");
             System.out.println("other line");// this is not related with of statement,without curly brackets if statement runs only one code block after if statement.

        if(3 % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");


        if(2==2)
            System.out.println("2 number");
        else if( 4 > 3)
            System.out.println("other line");
        else if(4 > 1)
            System.out.println("Don't do it!!");


    }
}
