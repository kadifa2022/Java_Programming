package day25_constracter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeapYearPractice {
    public static void main(String[] args) {

        String [] names ={"Ahmet", "Melisa", "Selma", "Alma" , "Nedi"};

        LocalDate [] birthdays = {LocalDate.of(2001,4,5),LocalDate.of(1980,3,5),LocalDate.of( 1997,12,12),
            LocalDate.of(1993, 10,4),LocalDate.of(1983,3,8)};

        LocalDate max= Collections.max(Arrays.asList(birthdays));
        System.out.println(max);
        boolean isLeapYear=max.isLeapYear();
        int indexOfName=0;

        for (int i = 0; i < birthdays.length; i++) {
            if (birthdays[i]==max) {
                indexOfName = i;
            }if (birthdays[i].isLeapYear()){
                System.out.println(names[i]+ " was born during a leap year");
            }
            
        }
        System.out.println("the youngest person is " + names[indexOfName]);

    }
}
/* 1. create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person

    4. find out who was born on leap year



 */