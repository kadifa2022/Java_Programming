package day09_selfPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        byte num1 = input.nextByte();//-128~127

        System.out.println("Enter your second number");
        short num2 = input.nextShort();

        System.out.println("Enter your third number");
        int num3 = input.nextInt();

        System.out.println("Enter your fourth number");
        long num4 = input.nextLong();

        input.close();//scanner is closed, can't read inputs again


    }
}
