package day_47_encapsulation_modifiers;

import day_46_static.CydeoStudent;

public class UseCydeoStudent {
    public static void main(String[] args) {

        CydeoStudent stu1 = new CydeoStudent("James", 5);
        System.out.println(stu1);

        System.out.println();
        CydeoStudent.printInfo();

        System.out.println();
        stu1.printInfo();

        System.out.println();

        System.out.println(CydeoStudent.instructors[0]);
        System.out.println(CydeoStudent.instructors[4]);

        System.out.println();

        for (String each : CydeoStudent.instructors){
            System.out.println(each);
        }


    }
}
