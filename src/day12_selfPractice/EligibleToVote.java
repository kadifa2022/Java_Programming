package day12_selfPractice;

public class EligibleToVote {//ask about this one


    public static void main(String[] args) {

    }



    public static void EligibleToVote(int age, boolean isAmerican) {
        if (age >= 18 && isAmerican) {

            System.out.println("You are eligible to vote");
        } else {
            System.err.println("You are not eligible to vote");

        }

    }
}
/*Create a method named eligibleToVote that takes two arguments:
1. age (int)
2. isAmerican (boolean)
Then the method should determine if the person eligible to vote
Ex:eligibleToVote(23, true)
output:
        You are eligible to vote
*/