package practice.inheritance;

public class UseApp {
    public static void main(String[] args) {
        App app = new App("Facebook", 5.3);
        System.out.println(app);
        app.download();
        Instagram instagram = new Instagram("Instagram",10.23);
        System.out.println(instagram);
        instagram.download();
        instagram.postPicture();
        YouTube youTube=new YouTube("Premium",2.1);
        System.out.println(youTube);
        youTube.download();
        youTube.watchVideo();
    }
}
