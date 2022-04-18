package day_05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b;   //You can store smmaler data type in biger,it's atomaticly casting

        int i2 = 100;
        //byte b2 = i2; // You cannot store biger data type in lower even if it fits,that's why we cast/casting using (byte)
        byte b2 = (byte) i2;

        int i3 = 500;
        long l1 = i3;

        long l2 = 200;
        int i4 = (int) l2;

        double d = 50;
        int i5 = (int) d;

        System.out.println(d);
        System.out.println(i5);



    }
}
