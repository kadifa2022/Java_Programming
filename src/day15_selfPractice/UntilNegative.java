package day15_selfPractice;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int num = 0;

         int sum=0;
        while (num >= 0) {
            System.out.println("Please enter a number");
            num = input.nextInt();
            if (num >= 0) {
                sum += num;
            }

        }
        System.out.println(sum);
        input.close();





    }
}
/*
5. Create a class named UntilNegative and Write a program
that calculates the sum of numbers entered by the
user until user enters a negative number.
 */