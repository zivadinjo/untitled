package day_33_methods;

public class MyMathClass {

    public static void add(double n, double m) {
        System.out.println(n + " + " + m + " = " + (n + m));
    }

    public static void subtract(double n, double m) {
        System.out.println(n + " - " + m + " = " + (n - m));
    }

    public static void multiply(double n, double m) {
        System.out.println(n + " * " + m + " = " + (n * m));
    }

    public static void divide(double n, double m) {
        if (m != 0) {
            System.out.println(n + " / " + m + " = " + (n / m));
        }else{
            System.err.println("Cannot divide with 0");
        }
    }

    public static void main(String[] args) {
        divide(4.1, 5.6);
        divide(5, 0);
    }

}
