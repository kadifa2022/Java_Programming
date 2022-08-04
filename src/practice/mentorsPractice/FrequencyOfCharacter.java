package practice.mentorsPractice;

import java.util.*;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        frequencyOfCharacter((Object) "google");
    }

        public static Map<Character, Integer>frequencyOfCharacter(Object str) {
            Map<Character, Integer> map = new LinkedHashMap<>();

            for (int i = 0; i <str.toString().length() ; i++) {
                if (str.equals("")){
                    map.clear();
                }else{
                    int frequency = Collections.frequency(Arrays.asList(str.toString().split("")), (str.toString().charAt(i) + ""));
                    map.put(str.toString().charAt(i), frequency);
                }
            }
            System.out.println(map);
            return map;

    }

public static void frequencyOfCharacter(String str){
        if (str==null){
            System.out.println("null");
        }
}


}


/*
    Write a method that returns the frequency of each characters of a given String parameter.
    If the given String is null, then return null
    If the given String is empty return an empty map
    1-an
    onl
 Example
    input: ""
    output: empty map
    explanation: input is empty
 Example
    input: null
    output: null
    explanation: input is null.
    nh
    tas
    Jllab
   " Since problem output is focused on the frequency we can
    comfortably use Map data structure. Because we can use
    characters as key and the occurrences of them as value."
 Example
    input: responsible
    output: {r=1, e=2, s=2, p=1,
    0=1, n=1, i=1, b=1, 1=1}
    explanation: characters are
    keys and occurrences are values



 */