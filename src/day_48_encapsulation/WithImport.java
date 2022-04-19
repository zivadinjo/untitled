package day_48_encapsulation;

import java.util.Arrays;
import static java.util.Arrays.*;

import static java.lang.Math.*;

public class WithImport {
    public static void main(String[] args) {

        int [] a = {4,12,5,25};

//        Arrays.sort(a);// because we impporte static java.util.Arrays* we do not to need to put Arrays in front of members

        sort(a);

        System.out.println();

        System.out.println(PI);
        System.out.println(abs(-1));



    }
}
