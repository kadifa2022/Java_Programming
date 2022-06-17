package day11_selfPractice;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

        char firstChar = word.charAt(0);

        if (firstChar >= 97 && firstChar <= 98) {
            System.out.println("First character is Digit");
        }else if(firstChar>=99 && firstChar<=100) {
            System.out.println("first character is lowercase letter");
        }else if(firstChar >= 101 && firstChar<= 102){
            System.out.println("first character is uppercase letter");
        }else if (firstChar >=50 && firstChar<54){
            System.out.println("first character is special character");
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