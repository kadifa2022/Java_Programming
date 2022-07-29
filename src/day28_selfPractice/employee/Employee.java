package day28_selfPractice.employee;

public class Employee {//must be private access modifiers-set the setters and getters /to string methods


    private String name;
    private double salary;

    public String getName(){//getter for read only
        return name;
    }
    public void setName(String name) {//just for assign new data//must pas parameter
        this.name=name;//
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){//condition statement
            System.err.println("Invalid salary:" +salary);
            System.exit(0);//terminate the program
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
