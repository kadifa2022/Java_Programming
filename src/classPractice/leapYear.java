package classPractice;

public class leapYear {

    public static void main(String[] args) {

        int  leapYear = 2000;
        //evenly divisible (%4==0) logical And (%400=0) logical And(%100 not equal 0)

        if (leapYear%4==0 && leapYear%400==0 && leapYear%100 !=0){

            System.out.println("is leapYear");

        }else if (leapYear%100==0) {

            System.out.println( "is not leapYear");
        }else

            System.out.println("is leapYear");



    }
}
