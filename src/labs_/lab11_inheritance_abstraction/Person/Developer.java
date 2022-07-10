package labs_.lab11_inheritance_abstraction.Person;

public class Developer extends Employee implements ScrumMember, WFH{

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String java) {
        super(name, age, gender, id, jobTitle, salary);

    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");

    }
    public void fixBug(){
        System.out.println(getName()+ "fixing bug");
    }


    @Override
    public void dailyStandUp() {
        System.out.println(getName()+ " is standing meeting");

    }

    @Override
    public void sprintPlaning() {
        System.out.println(getName()+"is running a spring meeting");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ "is working from home");

    }

}
/*
2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()


 */