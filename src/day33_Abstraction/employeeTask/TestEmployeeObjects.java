package day33_Abstraction.employeeTask;

public class TestEmployeeObjects {


    public static void main(String[] args) {
       // Employee employee = new Employee() {//obj
        Teacher teacher = new Teacher("Fata", 37, 'F', "a11", "MathTeacher", 730000);
        Developer developer = new Developer("Lucy", 34,'F',"A10", "Java developer",60000, "Java");
        Driver driver = new Driver("Ilfo", 40, 'M', "1A", "Truck Driver",90000);
        Tester tester = new Tester ("Marko", 39,'M', "B15", "Tester", 960000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);
        System.out.println("--------------------------------------------------------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();






    }
}
