package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//in the scanner memory will BE ENTER
        System.out.println("Enter your age"); //45

        int age = input.nextInt();

        input.nextLine();// clean scanner

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("Enter your age= " + age);
        System.out.println("Enter your full name = " + fullName);

    }
}
