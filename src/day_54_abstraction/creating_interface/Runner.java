package day_54_abstraction.creating_interface;

public class Runner {
    public static void main(String[] args) {

//        Create obj = new Create(); -> cannot creat objects of interface


        Book obj= new Book(); // Book is non-abstract class, so we can make objects from it
        obj.read();
        obj.write();

    }
}
