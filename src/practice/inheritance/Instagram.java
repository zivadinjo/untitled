package practice.inheritance;

public class Instagram extends App{

    public Instagram(String appName , double version) {
        super("Instagram",version);
    }

    public void postPicture (){
        System.out.println("Posting picture to instagram");
    }
}
