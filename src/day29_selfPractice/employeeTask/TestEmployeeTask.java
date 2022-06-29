package day29_selfPractice.employeeTask;

public class TestEmployeeTask {
    public static void main(String[] args) {

        Developer developer = new Developer("Tina", "Developer", "A10", 20, 'F', 90000, "Java");
        Driver driver = new Driver("Lana","Driver", "a12",23,'F', 80000);
        Teacher teacher = new Teacher("Muhtar", "Doctor","B1", 30, 'M', 1000000);


        System.out.println(developer);
        System.out.println(driver);
        System.out.println(teacher);

        System.out.println("----------------------------------------------");
    }
}
