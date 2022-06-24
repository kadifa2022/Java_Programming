package day28_selfPractice.person;

import java.time.LocalDate;

public class TestPersonObject {


    public static void main(String[] args) {

        Person person1 = new Person("Sara", 17, 'F', LocalDate.of(1994, 7, 5));

        Person person2 = new Person("Zara",20, 'f', LocalDate.of(2020,3,12));

        System.out.println(person1);
        System.out.println(person2);

    }
}
