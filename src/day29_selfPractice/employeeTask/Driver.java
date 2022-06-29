package day29_selfPractice.employeeTask;

public class Driver extends Employee {


    public Driver(String name, String jobTitle, String id, int age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }

    public void driver(){

        System.out.println(getName() + " is driving");
    }
}
