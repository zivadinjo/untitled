package day_35_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {

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
