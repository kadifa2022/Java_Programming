package lab3_loopsMethods;



    import java.util.Scanner;

    public class PizzaApp3 {

        public static void main(String[] args) {



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

            for(int i=3;i>0;) {
                //create the selection flow for the login type
                switch (loginType) {

                    case 1:  ///if I choose login type - 1, should do credential check

                        //Enter your email
                        System.out.println("Enter your email:");
                        String givenEmail = scanner.next();


                        if(!isEmailValid(givenEmail)){
                            System.out.println("Invalid Email. Please try again...");
                            continue;
                        }




                        //Enter your password
                        System.out.println("Please enter your password:");
                        String givenPassword = scanner.next();

                        //Check if log in successful
                        if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                            System.out.println("Successfully logged in with email");
                            break;

                        } else { //invalid checking

                            if(i!=1){  //ask again

                                System.out.println("Invalid credentials !! left " + (i-1) + " chances to try");

                                i--;  //i = i-1;
                                continue;  //do not execute anything after this point, go back to for loop
                                //break;   //stop the loop here, and exit the loop
                                //return   //stop the method that you are inside

                            }else{
                                System.out.println("Your account is locked - try again tomorrow");
                                System.exit(0); //close the execution of jvm

                            }

                        }


                    case 2:
                        System.out.println("Account number log in chosen");




                        break;  //stop the switch-case
                }

                break; //stop the for loop
            }

        }



        private static boolean isEmailValid(String givenEmail) {

            //Check if the email address is valid:  //if @ . available, and @ is before . mikegmail.com
            int firstSignOfIndex = givenEmail.indexOf('@');  // -1
            int secondSignOfIndex = givenEmail.indexOf('.');

            boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0; //invalid

            if(checkEmail){
                return false;
            }

            return isEmailDomainValid(givenEmail);
        }


        private static boolean isEmailDomainValid(String givenEmail) {


            //Check if domain is valid  //gmail and hotmail domain - > mike@gmail.com
            String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));        //gmail
            boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

            return checkDomain;

        }








    }






