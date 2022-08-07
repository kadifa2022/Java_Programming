package day01_selfPractice.Practice;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of square's side");
        int side = scanner.nextInt();
        int areaResult= (side * side);
        int perimeter = side * 4;
        System.out.println("Area of the square is " + areaResult + "\n" + "Perimeter of the square is " + perimeter);


    }
}
