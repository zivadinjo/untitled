package day_28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String[] studentOne = {"007" , "James" , "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String [4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo [0] = "010";
        studentTwo [1] = "Jamie";
        studentTwo [2] = "Smith";
        studentTwo [3] = "26";
        System.out.println(Arrays.toString(studentTwo));

        String[] studenThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID ");
        studenThree[0] = input.nextLine();
        System.out.println("Enter your firs name ");
        studenThree[1] = input.nextLine();
        System.out.println("Enter your last name ");
        studenThree[2] = input.nextLine();
        System.out.println("Enter your batch number ");
        studenThree [3] = input.nextLine();
        System.out.println(Arrays.toString(studenThree));


        String [] studentFour = new String[4];
        String []questions = {"Enter your ID" , "Enter yor first name" , "Enter your last name" , "What is your batch number"};

        for (int i = 0; i < 4 ; i++){
            System.out.println(questions[i]);
            studentFour[i]= input.nextLine();
        }
        System.out.println(Arrays.toString(studentFour));





    }
}
