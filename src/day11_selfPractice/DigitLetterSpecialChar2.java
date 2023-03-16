package day11_selfPractice;

import java.util.Scanner;

public class DigitLetterSpecialChar2 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1) {//at least one character
            char f = str.charAt(0);//first character of string
            if (f >= '0' && f <= '9') {
                System.out.println("First character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("First character is Uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("First character is lowercase letter");
            } else {
                System.out.println("First character is special character");
            }
        } else {
            System.out.println("String is empty");
        }
    }
}