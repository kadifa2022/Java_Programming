package day24_dateAndTime;



import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {
         //person object      0              1            2              3              4
        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        //call setInfo methode
         people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
         people[1].setInfo("Maja", 'F', LocalDate.of(1990, 6, 23));
         people[2].setInfo("Evica", 'F', LocalDate.of(1994, 4, 26));
         people[3].setInfo("Ana", 'M', LocalDate.of(1948, 9, 2));
         people[4].setInfo("Mnuel", 'F', LocalDate.of(1955, 3, 6));




        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );//call addAll methode--but the Array only takes

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).name + " "+studentsList.get(i).dateOfBirth);
        }



        studentsList.removeIf(p -> p.age >= 30 );
        System.out.println(studentsList);


        }




    }

// print name & date of birth of each person object



// remove all the person object that has the age > 55//remove if methode

