package day_22_loops;

public class Letters {
    public static void main(String[] args) {

        char lowerCaseUp= 'a';

        while (lowerCaseUp <='z'){
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;

        }
        System.out.println();
        // Z - A uppercase

        char uperCaseBack = 'Z';

        while (uperCaseBack >= 'A') {
            System.out.print(uperCaseBack + " ");
            uperCaseBack--;
        }



    }

}
