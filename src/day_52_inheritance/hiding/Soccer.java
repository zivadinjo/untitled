package day_52_inheritance.hiding;

public class Soccer extends Sport{

    public static void cheer(){
        System.out.println("Cheering from Child class");
    }

}

// it looks like we are overriding,but we are not because the method is static,we are hiding the cheer method from Parent class
