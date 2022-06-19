package day24_dateAndTime;


import java.util.Arrays;
        import java.util.Collections;

public class FrequencyOfCharacters {


    public static void main(String[] args) {//string to collection type

        String str = "aaabbbbccccc";//string day11

        String result = "";    //a3b4c5 string variable

        for (String each : str.split("")) { //split methode to get string Array

            int frequency = Collections.frequency(  Arrays.asList( str.split("") )  , each );//Array list call asList

            if(!result.contains(each)){//is not contain result
                result += each + frequency;//add character to result +frequency
            }

        }


        System.out.println(result);


    }


}