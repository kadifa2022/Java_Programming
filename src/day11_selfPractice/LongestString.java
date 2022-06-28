package day11_selfPractice;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        input.close();


        if (str1.length()>str2.length()) {//largest string
            System.out.print("First string is longest");
        }else if(str2.length()>str1.length()) {
            System.out.println("Second string is the largest");
        }else{
            System.out.println("Equal");

        }


    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"


 */