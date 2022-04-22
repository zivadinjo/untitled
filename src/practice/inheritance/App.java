package practice.inheritance;

public class App {

    String appName;
    double version;

    public void download (){
        System.out.println(appName + " is downloading " + version);
    }
    public App(String appName , double version) {
        this.appName = appName;
        this.version = version;
}
}
