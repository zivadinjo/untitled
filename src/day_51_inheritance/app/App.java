package day_51_inheritance.app;

public class App {

    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void download (){
        System.out.println(name + " is downloading version " + version);
    }

}
