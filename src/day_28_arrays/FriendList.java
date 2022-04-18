package day_28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have ");

        int num = input.nextInt();
        String[] friends = new String[num];

        for (int i = 0; i < friends.length; i++){
            System.out.println("Enter your friends name");
            friends[i] = input.next();
        }

        System.out.println(Arrays.toString(friends));



    }
}
