package day_28_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] num = {500, 120, -80, 90, 2500, -10};

        int biggestNum = num[0];
        int smalestNum = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > biggestNum) {
                biggestNum = num[i];
            }
            if (num[i] < smalestNum) {
                smalestNum = num[i];
            }


        }
        System.out.println("bigest " + biggestNum);
        System.out.println("smaleset " + smalestNum);


    }
}
