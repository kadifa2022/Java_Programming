package day33_Abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //  Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);
        // We can not create objects from an abstract class, Object MUST be created from  a concrete class

        Employee employee1= new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4= new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

        System.out.println("-----------------------------------------------------------");

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();



    }

}





