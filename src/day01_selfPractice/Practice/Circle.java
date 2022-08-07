package day01_selfPractice.Practice;


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius  circle ");

        double radius = scanner.nextInt();
        double area = 3.14f * radius * radius;
        double perimeter = 2 * radius * 3.14;
        System.out.println("Area of the square of the circle is " + area + " Perimeter of the circle is " + perimeter);
    }
}
