package labs_.lab11_inheritance_abstraction.Person;

public class TestPersonObject {

    public static void main(String[] args) {



        BusinessAnalyst businessAnalyst= new BusinessAnalyst("Ilfo",23,'M',"1A","Analyst",120000);
        Developer developer = new Developer("Budo", 36, 'M', "A2","Developer", 90000, "Java");
        Driver driver = new Driver("Hasib", 45, 'M', "A23","Driver",120000);
        Janitor janitor = new Janitor("Bibi", 17, 'F',"B1","Supervisor", 50000);
        ScrumMaster scrumMaster = new ScrumMaster("Susy", 30,'F',"A14","Scrum Master", 110000);
        Teacher teacher = new Teacher("Razija", 50, 'F', "A15","Teacher", 60000);
        Tester tester = new Tester("Niko", 37, 'M', "A21","Tester",120000);

        System.out.println(businessAnalyst );
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(janitor);
        System.out.println(scrumMaster);
        System.out.println(teacher);
        System.out.println(tester);

    }


}
