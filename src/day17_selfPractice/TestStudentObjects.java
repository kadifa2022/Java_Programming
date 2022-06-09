package day17_selfPractice;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Tina";
        student1.age = 15;
        student1.gender = 'F';
        student1.grade = 9;
        student1.id = "A11";
        student1.isFullTime = true;

        Student student2 = new Student();
        student2.setInfo("Belma",17,'F',10, "B12", false);

        Student student3 = new Student();
        student3.setInfo("Muhamed", 20, 'M', 12, "C14", false);

        Student student4 = new Student();
        student4.setInfo("Amina", 14 , 'F', 8, "A15", true);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


    }


}
