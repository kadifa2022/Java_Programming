package day28_selfPractice.employee;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Josh");//setter call
        employee1.setSalary(120000);
        System.out.println(employee1.getName());//getter call
        System.out.println(employee1.getSalary());


    }
}
