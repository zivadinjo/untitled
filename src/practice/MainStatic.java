package practice;

import day_52_inheritance.final_example.Main;

import java.util.Arrays;

public class MainStatic {

    public MainStatic() {
        System.out.println(0);
    }
    static void run (){
        System.out.println(1);
    }

    public static void main(String[] args) {
        MainStatic.run();
        System.out.println(2);
    }
    static {
        System.out.println(3);
    }

}
