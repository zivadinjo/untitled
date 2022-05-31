package practice.mixed;

public class NegativeReversed {
    public static void main(String[] args) {
       int num = -105;
       int reversed =0;
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
