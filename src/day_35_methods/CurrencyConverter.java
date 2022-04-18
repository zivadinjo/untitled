package day_35_methods;

public class CurrencyConverter {

    public static double convert(String type, double amount){

        switch (type.toLowerCase()){
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1_217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(convert("euro",100));
    }

}
