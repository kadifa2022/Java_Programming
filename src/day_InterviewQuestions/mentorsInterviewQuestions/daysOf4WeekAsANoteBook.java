package day_InterviewQuestions.mentorsInterviewQuestions;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class daysOf4WeekAsANoteBook {

    public static void main(String[] args) {



        String weekPrefix= "Week: ";
        String dayPrefix = "\t Day :";



            //outer loop will iterate over weeks
        for (int weekCounter =1; weekCounter< 5; weekCounter++){
            System.out.println(weekPrefix + weekCounter);

            //inner loop will iterate over days of the week
            //we need to start from 1 for each week
            //that why we assign 1 to day counter for each week

            for(int dayCounter=1; dayCounter < 8; dayCounter++){
                System.out.println(dayPrefix + dayCounter);
            }
        }

        System.out.println("---------------------------------------------------------------");


        //Solution2
        /*
        String weekPrefix = "Week: ";
        String dayPrefix = "  Day: ";
         int weekCounter = 1;

         while (weekCounter <= 4){
             System.out.println(weekPrefix + weekCounter);

             int dayCounter = 1;
             do{
                 System.out.println(dayPrefix + dayCounter);
                 dayCounter++;
             }while (dayCounter<=7);
             weekCounter++;
         }

*/




    }








}
