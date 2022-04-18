package day_18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        String s = "A";
        System.out.println(str.startsWith(s));

        System.out.println(str.startsWith("  App"));// String is space sensitive
        System.out.println(str.startsWith(  "App"));// Code doesn't care about spaces

        String sentance = "today was a good day";
        System.out.println(sentance.startsWith("today was"));//true
        System.out.println(sentance.endsWith("day"));//true
        System.out.println(sentance.endsWith(" day"));//true
        System.out.println(sentance.endsWith("good"));//false




    }
}
