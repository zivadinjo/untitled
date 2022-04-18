package day_35_methods;

public class FixFormat {

    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }


}
