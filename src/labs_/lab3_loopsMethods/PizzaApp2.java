package labs_.lab3_loopsMethods;

import java.util.Scanner;

import java.util.Scanner;

public class PizzaApp2 {


    public static void main(String[] args) {  //BREAK TILL 2:15

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        //Create 3 variables named email(string),account number(int),password and assign values, DB values
        String email = "mike@gmail.com";
        int accountNumber = 123; //account number can be between >100 and <1000
        String password = "password";

        //Ask customer if he/she wants to log in with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {
            //create the selection flow for the login type
            switch (loginType) {

                case 1:

                    //Enter your email
                    System.out.println("Enter your email:");   // break till 12:20
                    String givenEmail = scanner.next();

                    //Check if the email address is valid:  //if @ . available, and @ is before .
                    int firstSignOfIndex = givenEmail.indexOf('@');  // -1
                    int secondSignOfIndex = givenEmail.indexOf('.');

                    boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0; //invalid

                    if (checkEmail) {
                        System.out.println("Invalid Email Address");
                        continue;
                    }


                    //Check if domain is valid  //gmail and hotmail domain - > mike@gmail.com
                    String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));        //gmail
                    boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

                    if (!checkDomain) {
                        System.out.println("Invalid Domain");
                        return;
                    }

                    //Enter your password
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if log in successful
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else {
                        System.out.println("Invalid Credentials");
                        return;

                    }


                case 2:
                    System.out.println("Account number log in chosen");
                    break;
            }
        }


    }

    }
