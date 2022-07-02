package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {
        int score = 85;

        String result = "";

        if (score >= 60) {
            result = "passed";
        } else {
            result = "failed";

        }System.out.println(result);

        System.out.println("----------------------------------------------------");
         //assign to string
        String result2 = (score >= 60) ? "Passed" : "Failed";//ternary or shorthand of if and else

        System.out.println(result2);

        System.out.println("----------------------------------------------------");

        int age = 34;

        /*
        String r;
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not eligible";
        }
    */

        String result3 =  (age >= 21) ? "Eligible" : "Not eligible" ;//ternary must match if and else (? = :) returns one value and data must be the same

        System.out.println(result3);







    }

}


