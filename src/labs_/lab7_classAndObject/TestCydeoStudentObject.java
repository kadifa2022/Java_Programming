package labs_.lab7_classAndObject;


public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent();
        cydeoStudent1.setInfo("Naran", 30, 'M', true, true, "Java Developer Batch 1", 2, "Java");

        System.out.println(cydeoStudent1);

        CydeoStudent cydeoStudent2 = new CydeoStudent();
        cydeoStudent2.setInfo("Vasyl", 28, 'M', true, true, "Java Developer Batch 1", 3, "Java");

        System.out.println(cydeoStudent2);

        CydeoStudent cydeoStudent3 = new CydeoStudent();
        cydeoStudent3.setInfo("Daniel", 28, 'M', false, true, "Java SDET", 15, "Java");

        System.out.println(cydeoStudent3);



    }

}