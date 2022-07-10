package labs_.lab11_inheritance_abstraction.Person;

import jdk.swing.interop.SwingInterOpUtils;

public class Tester extends Employee implements ScrumMember, WFH{
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is testing the applications");

    }
    public void createTicket(){
        System.out.println(getName()+ "is creating ticket");//uniq
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName()+ "is standing meeting");

    }

    @Override
    public void sprintPlaning() {
        System.out.println(getName()+ "is running a spring meeting");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ "is working from home");

    }
}
/*
3. Create the following sub classes of the Employee:
			1. Tester
					extra methods:
						createTicket(), dailyStandUp(), workFromHome()

 */