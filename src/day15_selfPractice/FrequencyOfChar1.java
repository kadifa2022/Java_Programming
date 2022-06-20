package day15_selfPractice;

import java.util.Scanner;

public class FrequencyOfChar1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string and a char");
        String str = input.next();
        char ch = input.next().charAt(0);

        int frequency = 0;
        char eachChar = 0;
        for (int i = 0; i < str.length(); i++) {
            eachChar = str.charAt(i);
        }
        if (eachChar == ch) {
            frequency++;
        }
        System.out.println(frequency);
        input.close();
    }


}

/*

Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency
        Ex: inputs:
        str = "aabcccd"; char = 'c';
        output: 3
        inputs:
        "Java programming language" 'g'
        output: 4

 */