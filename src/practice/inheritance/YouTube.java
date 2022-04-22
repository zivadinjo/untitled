package practice.inheritance;

public class YouTube extends App {

    public YouTube(String appName, double version) {
        super("Youtube", version);
    }
    public void watchVideo (){
        System.out.println("Watching java tutorial");
    }
}
