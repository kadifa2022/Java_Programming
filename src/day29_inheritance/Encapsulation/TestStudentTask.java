package day29_inheritance.Encapsulation;

public class TestStudentTask {

    public static void main(String[] args) {
        Student student1 = new Student("Hamza", 25, 'M','A', "MIT");

        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);

    }
}
