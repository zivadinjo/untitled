package day_42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

        Person personOne = new Person(); // create an object from Person class
        Person personTwo = new Person();

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = false;

//        printing instance variables

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //        printing instance variables for personTwo

        System.out.println();

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);


    }
}
