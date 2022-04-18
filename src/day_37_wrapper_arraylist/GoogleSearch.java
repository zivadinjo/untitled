package day_37_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String[] arr = result.split(" ");

        String resultStr = arr[1].replace(",", "");
        String timeStr = arr[3].substring(1);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if (resultNumber >= 0) {
            System.out.println("TASK CASE PASSED - POSITIVE NUMBER");
        }

        if (timeNumber <= 2 && timeNumber >= 0) {
            System.out.println("TASK CASE PASSED - UNDER 2 SECONDS");
        }


    }
}
