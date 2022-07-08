package labs_.lab11_inheritance_abstraction.Person;

import jdk.swing.interop.SwingInterOpUtils;

public final class BusinessAnalyst extends Employee implements ScrumMember, WFH{
    public BusinessAnalyst(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }



    public void analyze(){//extra methode
        System.out.println(getName()+ "is analyzing the requirement");
    }

    @Override
    public void work() {
        System.out.println(getName()+ "gathering requirement documents");


    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName() + " is standing in meeting");

    }

    @Override
    public void sprintPlaning() {
        System.out.println(getName()+ "is running a sprint planning");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ "is working from home");

    }
}


