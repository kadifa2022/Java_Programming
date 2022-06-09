package day16_selfPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = " ";

        do {
            System.out.println("Enter the length of the rectangle");
            double length = input.nextDouble();
            while (!(length > 0)) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.err.println("Please re-enter");
                length = input.nextDouble();
            }
            System.out.println("Enter the width of the rectangle:");
            double width = input.nextDouble();

            while (!(width > 0)){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.err.println("Would you like to calculate another Rectangle? (yes/no)");
                width= input.nextDouble();
            }

            double area = length * width;
            double perimeter = 2 * (length * width);
            System.out.println("area =" + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another rectangle? (yes/no)");
            answer  = input.next().toLowerCase();

            while(!(answer.equals ("yes") || answer.equals("no"))){
                System.err.println("Invalid Entry! Please re-enter your answer:");
                answer = input.next();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo rectangle calculator APP");
                break;

            }
        }while(answer.equals("yes"));



    }
}