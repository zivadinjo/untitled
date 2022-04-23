package day_51_inheritance.app;

public class UseApp {
    public static void main(String[] args) {

        Instagram obj1 = new Instagram(3.2);
        obj1.download();
        obj1.postPicture();

        YouTube obj2 = new YouTube(5.1);
        obj2.download();
        obj2.watchVideo();


    }
}
