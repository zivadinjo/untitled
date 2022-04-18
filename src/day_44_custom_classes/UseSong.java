package day_44_custom_classes;

public class UseSong {
    public static void main(String[] args) {

        Song song1 = new Song("waka waka");
        System.out.println(song1);

        Song song2 = new Song("viva la vida", 3.14);
        System.out.println(song2);

        Song song3 = new Song("Thriller",3.58,"Michael Jackson","Pop");
        System.out.println(song3);


    }
}
