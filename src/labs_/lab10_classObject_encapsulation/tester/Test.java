package labs_.lab10_classObject_encapsulation.tester;


import labs_.lab10_classObject_encapsulation.Developer.Developer;

public class Test {

        public static void main(String[] args) {

            Tester tester1 = new Tester("Daniel", 28, 'M', "A01", "QA", 40);

            System.out.println(tester1);

            Developer developer1= new Developer("Ada",39,'F', "A20","Back End Developer", 55 ,"Java");
            System.out.println(developer1);

            developer1.coding();
            developer1.fixingBug();

        }

    }

