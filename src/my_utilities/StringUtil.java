package my_utilities;

public class StringUtil {

    public static String reverse(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


    /*   Fix Format
     Create a method will accept a String and return a String in proper format. Proper format is:
     First character starting as uppercase and the rest as lowercase
    */

    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given wor*/

    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    /*Unique Characters

    create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.*/


    public static String uniqueCharacters (String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i< str.length();i++){

            if (checked.contains("" + str.charAt(i))){
                continue;
            }

            int counter = StringUtil.frequencyOfCharacter(str, str.charAt(i));
            if(counter == 1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }


}
