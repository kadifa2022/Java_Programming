package day11_selfPractice;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();

        if(userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are logged in");
            } else {
                System.out.println("Incorrect username or password. Please try again");
            }

    }
}

/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon

 */