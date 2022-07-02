package day08_ternary_switch;

public class IfStatementAndTernariesPractice {


    public static void main(String[] args) {

        int score = 90;

        String result = "";//

        if (score >= 0 && score <= 100) {//nested if

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";//ternary

        } else {
            result = "Invalid Score";//if condition is not met
        }

        System.out.println(result);

        System.out.println("---------------------------------");

        String result2 = (score >= 0 && score <= 100) ?//ternary is not recommended
                (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F"
                : "Invalid Score";

        System.out.println(result2);


    }

}



