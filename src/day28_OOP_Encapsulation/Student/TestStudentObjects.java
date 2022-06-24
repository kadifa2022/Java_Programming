package day28_OOP_Encapsulation.Student;

public class TestStudentObjects {


        public static void main(String[] args) {

            Student student = new Student();

            // student.age = -200;

            //  System.out.println( student.age );

            student.setAge(25);

            System.out.println( student.getAge());


            // student.name = "Aaron";
            //  student.setName("Aaron");

            System.out.println(student.getName());





        }

    }

