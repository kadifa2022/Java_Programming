package day42_maps.selfPractice;

import java.util.Locale;

public class DuplicatedLetters {
    public static int getNumber(String str){
        str = str.toLowerCase();
        String temp= "";
        String output="";

        for(char ch: str.toCharArray()){
            if(!temp.contains(ch+"")){
                temp +=ch;

        } else if (!output.contains(ch+"")) {
                output +=ch;
            }

            }
            return output.length();

        }
}
