package day_InterviewQuestions.mentorsInterviewQuestions;

import java.util.Scanner;
public class DetermineTheChange_VendingMachine {

    int input, quarters,dimes, nickles, pennies, remain;{


    Scanner s = new Scanner(System.in);
    System.out.println("Enter cents: ");
    input = s.nextInt();
    s.close();

    if(input < 100 && input > 0){
        quarters = input /25;
        remain = input % 25;
        dimes = remain /10;
        remain = remain % 10;
        nickles =remain /5;
        pennies=remain % 5;
        System.out.println("Your Change is " + quarters+ "quarters," + dimes + "dimes, " + nickles+ "nickles, and " + pennies + "pennies");

    }else{
        System.out.println("Invalid cents amount");
    }

}
}