package Replit;

import java.util.Scanner;

public class FinedGrader {
    public static void main(String[] args) {


        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:

        if (a < b) {

            System.out.println(b+ " is grater");

        }
     else {
            System.out.println( a+ " is grater");
        }

    }


}

      /* EX:  Input:
        1
        2

        Output:
        2 is greater*/