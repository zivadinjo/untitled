package day_32_arrays_multidimensional;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = new String[4][];
        System.out.println(Arrays.deepToString(cydeo));

        String[] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 2");

        String[] groupTwo = {"Basri", "Ismail", "Demet", "Shina"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 3");
        cydeo[2] = new String[]{"Mustafa", "Lima"};
        System.out.println(Arrays.deepToString(cydeo));// making array without reference(no groupThree)

        System.out.println("Coping group 3 as group 4");// with copyOf method
        cydeo[3] = Arrays.copyOf(cydeo[2], cydeo[2].length);
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();

        for (String [] innerArray :cydeo){       // loops trough 2D array,cydeo

            for(String eachWord : innerArray){   // loops trough every String element in each 1D inner array
                System.out.println(eachWord);
            }

        }


    }
}
