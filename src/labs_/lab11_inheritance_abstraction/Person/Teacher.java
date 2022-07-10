package labs_.lab11_inheritance_abstraction.Person;

import jdk.swing.interop.SwingInterOpUtils;

public class Teacher extends Employee implements WFH{
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);


    }

    @Override
    public void work() {
        System.out.println(getName()+" is preparing for the class");

    }
    public void teacher(){
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ " is working from home");

    }
}
/*
5. Teacehr:
					extra methods:
						teach(), workFromHome()


 */



