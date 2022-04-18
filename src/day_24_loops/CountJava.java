package day_24_loops;

public class CountJava {

    public static void main(String[] args) {

        String str = "java is java language.java";
        int count =0;

        for (int i = 0; i < str.length()-3; i++){

            String everyFour = str.substring(i , i + 4);
            System.out.println(everyFour);
            if (everyFour.equals("java")){
                count++;
            }

        }

        System.out.println(count);

    }

}
