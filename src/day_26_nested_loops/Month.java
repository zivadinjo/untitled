package day_26_nested_loops;

public class Month {
    public static void main(String[] args) {

        for (int week = 1; week <= 4; week++) {

            System.out.println("Week: " + week);

            for (int day = 1; day <= 7; day++){

                System.out.println("\tDay: "+ day);

                switch (day){
                    case 1:
                        System.out.println("M");
                        break;
                    case 2:
                        System.out.println("T");
                        break;
                    case 3:
                        System.out.println("W");
                        break;
                    case 4:
                        System.out.println("T");
                        break;
                    case 5:
                        System.out.println("F");
                        break;
                    case 6:
                        System.out.println("S");
                        break;
                    case 7:
                        System.out.println("S");
                        break;


                }

            }

        }


    }
}
