package day_54_abstraction.animal;

import day_54_abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over the seeds");
    }

    @Override
    public void fly() {

    }

    @Override
    public void hi() {
        System.out.println("Hello Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye bye");
    }
}
