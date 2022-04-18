package day_27_nested_loops;

public class ConitinueInNested {
    public static void main(String[] args) {

        for ( int i = 0; i < 5 ; i++){

            System.out.println("i" + i);

            for ( int j = 0; j < 3 ; j++){

                if (j == 1){
                    continue;
                }


                System.out.println("\tj" + j);


            }



        }



    }
}
