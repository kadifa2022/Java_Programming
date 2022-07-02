package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number");
        //int num = new Scanner(System.in).nextInt();
        String day= "Invalid entry";

        int num = input.nextInt();



        if (num >= 1 && num <= 7) {
            day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
        }
        System.out.println(day);

        input.close();

    }
}

     /*   int n = 5;
        String weekDays = "";

        if (n == 1) {
            weekDays = " Monday";
        }
        if (n == 2) {
            weekDays = " Tuesday";
        }
        if (n == 3) {
            weekDays = " Wednesday ";
        }
        if (n == 4) {
            weekDays = " Thursday ";
        }
        if (n == 5) {
            weekDays = " Friday ";
        }
        if (n == 6) {
            weekDays = " Saturday ";
        }
        if (n == 7) {
            weekDays = " Sunday ";
        }
        System.out.println(weekDays);


    }
}

      */
