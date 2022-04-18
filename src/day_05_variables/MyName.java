package day_05_variables;

public class MyName {
    public static void main(String[] args) {

        char letterOne = 'M';
        char letterTwo = 'I';
        char letterThree = 'L';
        char letterFour = 'A';
        char letterFive = 'N';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);

        System.out.println(letterOne+" "+letterTwo+" "+letterThree+" "+letterFour+" "+letterFive);

        System.out.println(letterOne+""+letterTwo+""+letterThree+""+letterFour+""+letterFive);

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive;


        System.out.println("My name: " + name);


    }
}
