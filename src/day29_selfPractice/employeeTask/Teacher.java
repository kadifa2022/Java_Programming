package day29_selfPractice.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, String id, int age, char gender, double salary) {
        super(name, jobTitle, id, age, gender, salary);
    }


  public void teaching(){
      System.out.println(getName() + " is teaching");
    }
}
