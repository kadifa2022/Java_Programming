package labs_.lab11_inheritance_abstraction.Person;

import jdk.swing.interop.SwingInterOpUtils;

public final class ScrumMaster extends Employee implements ScrumMember,WFH{

    public ScrumMaster(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);



    }

    @Override
    public void work() {
        System.out.println(getName()+ " is scheduling meetings");

    }
    public void coaching(){
        System.out.println(getName()+ " is coaching");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName()+ "is standing meeting");

    }

    @Override
    public void sprintPlaning() {
        System.out.println(getName()+"is running a sprint planning meeting");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ " is working from home");

    }
}




