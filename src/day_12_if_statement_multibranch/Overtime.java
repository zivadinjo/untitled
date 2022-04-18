package day_12_if_statement_multibranch;



public class Overtime {
    public static void main(String[] args) {


        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netPay;
        String message;


        if (numberOfHours > 40) {
            double overtimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate + overtimeHours * (hourlyRate * 1.5);
            message = "You worked "+ numberOfHours+" hours at at rate of "+ hourlyRate+" but "+ overtimeHours+" of the hours are overtime,so you have additional pay.";

        } else {
            netPay = hourlyRate * numberOfHours;
            message = "You worked "+ numberOfHours+" hours at at rate of "+ hourlyRate+" there's no overtime.";
        }

        System.out.println("My total net pay is: $"+ netPay);


    }
}
