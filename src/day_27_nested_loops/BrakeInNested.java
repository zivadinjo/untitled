package day_27_nested_loops;

public class BrakeInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){

            System.out.println("i" + i);

            if (i == 3){
                break;// when this break is run,it runs until outer loop(i) is equal to 3,until that runs both loops outer and inner.
            }

            for (int j = 0; j< 2; j++){

                System.out.println("j" + j);
                //break; stops the inner loop,runs only one execution,than it hits break;and stops,goes to outer loop,and then repeat until outer loop is done.
            }

            System.out.println();
           //break; stops the outer loop,runs only one execution until it comes to break;
        }


    }
}
