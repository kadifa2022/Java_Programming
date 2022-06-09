package day15_selfPractice;

import day08_selfPractice.CydeoBatches;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username = "";
        String password = "";

        System.out.println("Please enter your user name ");
        username = input.next();
        System.out.println("please enter your password");
        password = input.next();

        if (username.equals("Cydeo") && password.equals("Cydeo1 123")) {
            System.out.println("Logged in.");
        } else if (!(username.equals("Cydeo") && password.equals("Cydeo123"))) {
            for (int i = 0; i < 3; i++) {

                System.out.println("Please enter your User name");
                username = input.next();
                System.out.println("Please enter your password");
                password = input.next();

                if (username.equals("cydeo ") && password.equals("Cydeo123")) {
                    System.out.println("Loged in.");
                    break;
                }
                if (i == 2 || username.equals("Cydeo") ||
                        password.equals("Cydeo123")) {

                    {
                        System.out.println("You are locked out of your account");
                    }

                }


            }

        }
    }
}
/*

 7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
        username: Cydeo
        password: Cydeo123

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched, the program should allow the user to have three attempts to enter correct
        credentials and if all three attempts are failed, then print "Your account is locked."

 */
