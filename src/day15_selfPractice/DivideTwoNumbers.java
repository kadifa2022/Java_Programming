package day15_selfPractice;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        while (num1 >= num2) {
            num1 -= num2;
            result++;


        }
        System.out.println(result);
    }

}


/*4.  Create a class named DivideTwoNumbers and Write a
program that can divide two positive numbers
 without using / (division) and * (multiplication) operators.



 */