package day16_selfPractice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(true){
            System.out.println("Enter the radius of a circle");
            double radius = input.nextDouble();

            if(radius == 0){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }
            double pi = 3.14;
            double area = pi * radius * radius;
            double perimeter = 2 *pi * radius;
            double diameter = 2* radius;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("would you like to calculate another circle? (yes/no)");

            String answer = input.next().toLowerCase();

            while(!(answer.equals ("yes") || answer.equals ("no"))){
                System.err.println("invalid answer! Would you like to calculate another circle (yes/no)");
                answer = input.next().toLowerCase();
            }
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo circle calculator APP");
                return;
            }
        }

    }

}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */