package day_55_polymorphism.animal;

public class Runner {
    public static void main(String[] args) {

        // all possible reference of Lizard

        //self
        Lizard lizard =  new Lizard();
        lizard.eat();
        lizard.name = "lizard";
        System.out.println(lizard.name);
        lizard.numberOfClaws = 10;
        System.out.println(lizard.numberOfClaws);
        lizard.skinColor = "camo";
        System.out.println(lizard.skinColor);
        System.out.println();

        //super class -> Reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "lizard";
        System.out.println(reptile.name);
        reptile.numberOfClaws = 10;
        System.out.println(reptile.numberOfClaws);
//        reptile.skinColor = "camo"; -> Reptile reference doesn't have access to skinColor because it's in Lizard clas
//        System.out.println(reptile.skinColor);
        System.out.println();

        //super class -> Animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "lizard";
        System.out.println(animal.name);
//        animal.numberOfClaws = 10;
//        System.out.println(animal.numberOfClaws);
//        animal.skinColor = "camo";
//        System.out.println(animal.skinColor);

         /*

            We made 3 Lizard objects with 3 different references:
            Lizard (itself), Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run

         */

    }
}
