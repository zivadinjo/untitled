package day_07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);

        x++;
        System.out.println(x);// Incremented value x gets up for 1 always,post increment

        ++x;
        System.out.println(x);// Incremented value x by 1,value of x changed on line up on post ioncrement,this is pre increment

        System.out.println(x++);//Post increment is added after code run
        System.out.println(x);//In this one is value incresed by 1

    }
}
