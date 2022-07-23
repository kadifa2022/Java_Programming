package day13_returnMethods;

import java.util.Scanner;

public class DaysInMonth {





    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();
            //implicitly give
        if(month < 1 || month > 12){ // if the month is invalid
            System.err.println("Invalid number");
            return; // terminates the main method
        }


        switch (month){ // 1 ~ 12

            case 2:
                System.out.println("28 days");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;

            default://default block is for the rest of the months with 31 days
                System.out.println("31 days");//more months with 31 days


        }



    }

}