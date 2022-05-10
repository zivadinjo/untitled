package day_56_polymorphism.book;

public abstract class EBook extends Book implements Downloadable{

    double size;

    public abstract void open();

}
