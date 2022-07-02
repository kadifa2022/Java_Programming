package day09_scanner;

public class CrewAndPassengers1 {


    public static void main(String[] args) {


        int number = 75;

        String result1 = (number == 50 || number == 75 || number == 100) ?//ternary
                (number == 50) ? "20 crew, 30 passengers"
                        : (number == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                : "invalid";
        System.out.println(result1);


        System.out.println("-----------------------------------------------------------");


     //   System.out.println(5*(2+3));




        if (number ==50 || number  ==75 || number==100){

            switch(number){//switch//can't be boolean,long, float and double
                case 50:
                    System.out.println("20 crew, 30 passengers");//ascending order from smaller to bigger number or A-Z
                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;

                default:
                    System.out.println("30 crew, 70 passengers ");
            }

        }else{
            System.out.println("Invalid Number");
        }


    }

}








/*Given a number of people on the ship (int number)
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

        Solution1: Use ternary. Do not use more than one println()
        Solution2: Use switch statement. Do not use more than one println()


    2.Create a class named NumberOfDays, an integer variable named month is given, Use switch statement to write a program that can find the number of days in the given number of month.

            EX:
                month = 5
 */