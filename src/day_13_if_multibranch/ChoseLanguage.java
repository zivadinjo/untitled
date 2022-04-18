package day_13_if_multibranch;

import java.util.Scanner;

public class ChoseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please chose a language: \n\t1- English\n\t2- Spanish\n\t3- Turkish\n\t4- Russian\n\t5- French");
        int option = input.nextInt();
        String message;

        if(option==1){
            message = "hello thank you for your cal";
        }else if(option==2){
            message= "hola,gracias para llamar";
        }else if(option==3){
            message= "merhaba aradiginiz icin tesekulec";
        }else if(option==4){
            message= "privet,spasiba za vash zvonok";
        }else if(option==5){
            message= "merci por votre appel";
        }else{
            message = "Ne zovi vise ";
        }
        System.out.println(message);


    }
}
