package day15_selfPractice;

import java.util.Scanner;

public class FrequencyOfChar {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str =" Java Programing Language";

        input.close();

        char ch ='g';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)){
                frequency+=1;
            }
        }
        System.out.println(frequency);


    }
}





/*

 Create a class named FrequencyOfChar and Write a program that asks user to enter
  a string and a char, the returns the frequency of the char from the given string
        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';

        output: 3

        inputs:
        "Java programming language"
        'g'

        output: 4

 */
