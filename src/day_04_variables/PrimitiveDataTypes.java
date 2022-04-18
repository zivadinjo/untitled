package day_04_variables;

public class PrimitiveDataTypes {


    public static void main(String[] args) {


        byte age = 36;
        System.out.println("age"); // Text between quotations
        System.out.println(age);   // Print of variable

//        byte age2 = 200 ; 200 is to big for byte type

        short year; // Declared variable called year. It is short type
        year = 2022; // assigned 2022 into year variable
                     /* Could be declared in one step and assigned in second step,could be done in multiple steps*/
        year = 2023; // reasigns a value to be 2023,chages it

        int AdressNumber = 145506;


        // long BigNumber = 18965334852301789; compailer reads it by default that is ;int; but is to big for int, that letter "L" at the end says to compailer that is actualy long number

        long BigNumber = 18965334852301789L;

        System.out.println(BigNumber);









    }




}
