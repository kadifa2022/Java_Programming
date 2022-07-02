package day08_ternary_switch;

public class TernaryIntro3 {//just use for simple if statement//ternary is not recommended for different data type
    public static void main(String[] args) {

        int score = 130;
        /*
        String result = "";
        if(score >= 0 && score <= 100){//nested if task
            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
*/

        String result = (score >= 0 && score <= 100) ?// pre condition of nested ternary-nestet if to ternary
                (score >= 60) ? "Passed" : "Failed"//two condition -met-pass or not met fail
                : "Invalid Score";//if condition is failed

        System.out.println(result);

        System.out.println("----------------------------------------");

        int n = 9;

        String day = (n >= 1 && n <= 7) ?//precondition of ternary-short hand
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";// condition not met --create


        System.out.println(day);






    }
}
