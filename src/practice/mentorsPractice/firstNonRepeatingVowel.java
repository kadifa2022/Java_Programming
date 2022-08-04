package practice.mentorsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingVowel {


    static int firstRepeatingVowel(String str){

        Map<Character,Integer> map=new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                if(!map.containsKey(ch)){
                    map.put(ch,i);
                }else{
                    map.put(ch,-1);
                }

            }
            for(Integer value: map.values()){
                if(value >= 0);
                return value;
            }
        }
        return -1;


    }
}
/*
    Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
    If it doesn't exist, return -1.
    Assume that all the characters of the String is lowercase.
    Do not use String class functions other than charAt() and length()
    You can also try to solve with Map data structure like using a Map<Character, Integer> variable.

Example
    input: google
    output: 5
    explanation: only e is
    non-repeated vowel and it's
    index is 5
Example
    input: mood
    output: -1
    explanation: o is repeated, no
    non-repeating vowel.
Example
    input: responsible
    output: 4
    explanation: e is repeated, g
    and i are not repeated, g is the
    first non-repeating vowel
 */