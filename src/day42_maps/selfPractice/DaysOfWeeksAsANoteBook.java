package day42_maps.selfPractice;

public class DaysOfWeeksAsANoteBook {
    public static void main(String[] args) {


        String weekPrefix="Week:";
        String dayPrefix="\t Day:";
        //outer loop will iterate over weeks
        for(int weekCounter=1;weekCounter<5; weekCounter ++){
            System.out.println(weekPrefix + weekCounter);


            //inner loop will iterate over days of the week
            //we need to start from 1 for each week
            //that why we assign 1 to day counter for each day

            for(int dayCounter=1; dayCounter<8; dayCounter++){
                System.out.println(dayPrefix + dayCounter);
            }

        }
    }
}
