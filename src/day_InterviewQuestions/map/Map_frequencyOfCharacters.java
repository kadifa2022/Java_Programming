package day_InterviewQuestions.map;

import java.beans.beancontext.BeanContextChild;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;



public class Map_frequencyOfCharacters {



    /*
Write a method that prints the frequency of each character from a String
*/


    public static void frequencyTest(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if(map.containsKey(each)){
                map.put(each, map.get(each) +1);
            } else {
                map.put(each, 1);
            }

            }
        System.out.println();

    }
}
