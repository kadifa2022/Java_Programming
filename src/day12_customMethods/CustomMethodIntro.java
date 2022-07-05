package day12_customMethods;

public class CustomMethodIntro {

    public static void main(String[] args){




            System.out.println("Test started");//after we create methode we need to use main methode to called it

            greetings();//custom methode

            System.out.println("Test Completed");

            System.out.println("-----------------------------");

            displayMessage();

        }


        public static void greetings(){// FIRST CUSTOM METHOD WE CREATE//can't be created inside another methode

            System.out.println("Hello Cydeo");
            System.out.println("How are you today?");
            System.out.println("Are you ready to learn Java");

        }


        public static void displayMessage(){
            System.out.println("Hello World");
            System.out.println("I love Java");
        }




    }