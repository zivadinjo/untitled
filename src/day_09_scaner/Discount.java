package day_09_scaner;

public class Discount {
    public static void main(String[] args) {

        boolean isItWeekend = true;
        boolean areYouTeacher = false;
        boolean areYouPolice= false;
        boolean areYouFairfighter = false;

        boolean doYouGetDiscount = isItWeekend && (areYouTeacher || areYouPolice || areYouFairfighter);
        // && has advantage from || thars why || is in parenteses

        System.out.println(doYouGetDiscount);



    }


}
