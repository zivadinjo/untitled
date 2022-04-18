package day_21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int n = 2;


        while (n <= 100) {
            System.out.println(n);
            n += 2;
        }
        System.out.println();
        // approach 2

        int i = 1;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // odd number

        int a = 1;

        while (a <= 100) {
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println();
        //approach 2

        int b = 0;

        while (b++ < 100) { // we dont put <= only < so it doesn't print 101 in this case
            if (b % 2 == 1) {
                System.out.print(b + " ");
            }
        }

    }
}
