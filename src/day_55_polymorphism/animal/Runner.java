package day_55_polymorphism.animal;

public class Runner {
    public static void main(String[] args) {

        // all possible reference of Lizard

        //self
        Lizard lizard =  new Lizard();
        lizard.eat();

        //super class -> Reptile
        Reptile reptile = new Lizard();
        reptile.eat();

        //super class -> Animal
        Animal animal = new Lizard();
        animal.eat();

         /*

            We made 3 Lizard objects with 3 different references:
            Lizard (itself), Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run

         */

    }
}
