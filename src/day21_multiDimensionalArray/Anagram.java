package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {//task day20
    public static void main(String[] args) {

        String str1 = "heart";//anagram is two words with same characters
        String str2 = "earth";//-sort the string-

            // String []a1= str1.split("");//split to empty string
           char[] a1 = str1.toCharArray();
           char[] a2 = str2.toCharArray();
           //sort with Array

        Arrays.sort(a1);
        Arrays.sort(a2);
        //compare is equal
       boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println("isAnagram = " + isAnagram);







    }
}
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
                str2 = "earth"

            output:
                true

                str1 = "java"
                str2 = "python"
            output:
                false


 */