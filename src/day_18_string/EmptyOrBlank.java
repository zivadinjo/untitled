package day_18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());

        str = ""; //empty space npo characters
        System.out.println(str.isEmpty());

        String s = " ";// space is character
        System.out.println(s.isEmpty());// space is there space is character

        System.out.println(s.isBlank());




    }
}
