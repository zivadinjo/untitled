package day_35_methods;

public class FrequencyOfCharacter {

    public static int frequencyOfCharacter(String str, char letter){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count ++;
            }
        }
        return count;
    }

}
