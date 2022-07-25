package practice.mentossInterviewQuestions;

public class Milliseconds {

    public static void main(String[] args) {


        long milliseconds = 366000;

        int seconds = (int) (milliseconds / 1000) % 60;
        int minutes = (int) ((milliseconds /(1000*60)) % 60);
        int hours = (int) ((milliseconds / (1000*60*60)) % 24);

        System.out.println(milliseconds +" milliseconds = " + hours + " hours, " + minutes + " minutes, " +seconds+ " seconds" );


    }
}
