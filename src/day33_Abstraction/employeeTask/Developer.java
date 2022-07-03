package day33_Abstraction.employeeTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    private String programmingLanguage;


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void work() {
        System.out.println(getName() + " is codding in" +programmingLanguage);

    }

    @Override
    public String toString() {
        return super.toString().replace("{" , " ")+
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
