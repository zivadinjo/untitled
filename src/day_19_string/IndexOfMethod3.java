package day_19_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";
        // index    =  0123456789
        System.out.println("first i "+ word.indexOf('i'));
        System.out.println("last i "+ word.lastIndexOf('i'));

        System.out.println("second i "+ word.indexOf('i',4));
        System.out.println("third i "+ word.indexOf('i' , 6));


    }
}
