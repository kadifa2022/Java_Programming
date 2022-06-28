package day11_selfPractice;

import day26_selfPractice.CydeoStudent;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {



        String str = new Scanner(System.in).nextLine();//for scanner to use only one time /no need to closed scanner

        if (str.length() >= 1) {//if the string has at least one character//nested if statement

            char f = str.charAt(0);//first character of string

            if (f >= '0' && f <= 9) {

                System.out.println("First character is Digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }
        }else{//if string is empty
            System.out.println("String is Empty");
        }






    }


}
/*
3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table


 */