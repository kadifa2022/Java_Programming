package day01_selfPractice.Practice;

import java.util.Scanner;

public class KilosToPounds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers in kilograms");
       double kg = scanner.nextInt();
       double lb = kg * 2.2;
        System.out.println(kg + " is equal to " + lb + "pounds.");
    }
}
