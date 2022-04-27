package practice;

import java.util.ArrayList;

public class Pond {

    public Pond() {
        System.out.println(1);
    }

    public Pond(int num) {
        this();
        System.out.println(2);
    }

    public Pond(String str) {
        this(str.length());
        System.out.println(3);
    }
}

class CellPhones{
    public static void main(String[] args) {

        new Pond("iphone");
        new Pond();
        new Pond(4);



    }
}