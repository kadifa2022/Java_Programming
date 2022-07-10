package labs_.lab11_inheritance_abstraction.Person;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is driving");

    }
    public void drive(){
        work();

    }

}
/*
6. Driver:
					extra methods:
						drive()
 */