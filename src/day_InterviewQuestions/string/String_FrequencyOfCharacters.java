package day_InterviewQuestions.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;


public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
     Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    //solution 1
    public static String frequencyOfChars1(String str) {
        String expectResult = "";
        int j = 0;

        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            expectResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectResult;

    }


    //solution 2
    public static String frequencyOfChars2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) ;
            nonDup += "" + str.charAt(i);
        }
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;

                }

            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }


    //solution 3
    public static String frequencyOfCharacters3(String str) {
        String b = new HashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(",", "").replace("[", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                }
            }
            result += b.substring(j, j + 1);
        }
        return result;
    }

   //solution 4
/*
    public static String frequencyOfCharacters4(String str) {

        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }


        for (int i = 0; i < nonDup.length(); i++) {
             int num = Collection.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
             result += "" + nonDup.charAt(i)+num;
                
         }

         return result;
    }*/
}