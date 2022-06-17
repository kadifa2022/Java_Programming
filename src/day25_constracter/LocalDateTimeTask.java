package day25_constracter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;





public class LocalDateTimeTask {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE,  hh:mm a, MMM/dd/y,");

        LocalDateTime DateTime= LocalDateTime.of(2020, 11,24, 13,00);


        System.out.println(DateTime.format(dtf));








}
}

/*

 *use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
            ateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();
            */