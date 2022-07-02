package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {



     char grade = 'Q';



        /*
        A:excellent
        B:Great Job
        C:good
        D:passed
        F:fail

         */

        /*
        String result;//multibranch if statement
        if (grade == 'A'){//equal operator for boolean
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";

        }
        System.out.println(result);
        System.out.println("----------------------------------");


         */



        switch (grade) {//comparing value-use to pass one value-and finding matching data

            case 'A'://case value must match with the data type of expression char to char, int-int, string -string
                System.out.println("Excellent");//expression (long, double,float and boolean can't be accepted in switch)
                break;//case closed

            case 'B':// case can't be the same
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default://preferred to place on the end
                System.out.println("Invalid");//no need to add break on the last block will exit the switch automatically

        }


    }


}


