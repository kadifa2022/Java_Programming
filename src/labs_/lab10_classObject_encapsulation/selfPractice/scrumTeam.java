package labs_.lab10_classObject_encapsulation.selfPractice;

import labs_.lab10_classObject_encapsulation.Developer.Developer;
import labs_.lab10_classObject_encapsulation.tester.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {

    private String PO, BA, SM;
    private ArrayList<Tester> testers= new ArrayList<Tester>();
    private ArrayList<Developer>developers=new ArrayList<Developer>();
    private int daysOfSpirit;

    public String getPO(){return PO;}

      public void setPO(String PO){
        terminate(PO, "Invalid PO name:" + PO);
        this.PO=PO;
    }
    public String getBA(){return BA;}

    public void setBA(String BA){
        terminate (BA, "invalid BA name;" + BA);
        this.BA=BA;

    }
     public String getSM(){return SM;}

     public void setSM(String SM){
        terminate(SM, "Invalid SM name; " + SM);
        this.SM = SM;
    }
     public int getDaysOfSpirit(){return daysOfSpirit;}

    public void setDaysOfSpirit(int daysOfSpirit){
        if (daysOfSpirit <=0 ){
            System.err.println("Invalid days of spirit:" + daysOfSpirit);
            System.exit(1);
        }
        this.daysOfSpirit= daysOfSpirit;
    }
    public ArrayList<Tester>getTesters(){
        return testers;}

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }
    public static void terminate (String arg, String err){
        if(arg==null || arg.trim().isEmpty()){
            System.err.println(err);
            System.exit(1);
        }
    }

    public scrumTeam(String PO, String BA, String SM, int daysOfSpirit) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSpirit(daysOfSpirit);
    }
    public void addTester(Tester tester){testers.add(tester);}

    public void setTesters(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }
}
/*
3. create a class called ScrumTeam
        Attributes:
        PO (String), BA (String), SM (String)
        testers (ArrayList<Tester>)
        developers(ArrayList<Developer>)
        daysOfSprint (int)
        Encapsulate the fields PO, BA, SM and daysOfSprint
        Conditions:
        PO, BA, SM can not be null/empty/blank
        days of sprint can not be 0 or negative
        Encapsulate tester and developers but ONLY generate getters
        (we do not set them by setters we will use add and remove functions instead)
        Add a constructor that can set the names of PO, BA and SM
        Methods:
        addTester(Tester tester): adds the given tester to the testers ArrayList
        addTester(Tester[] testers): adds the given testers to the testers ArrayList
        addDeveloper(Developer developer): adds the given developer to the developers ArrayList
        addDeveloper(Developer[] developers): adds the given developers to the developers ArrayList
        removeTester(long employeeID): removes the given tester from the testers ArrayList
        removeDeveloper(long employeeID): removes the developer from the developers ArrayList
        toString(): prints PO name, SM name, BA name, number of testers, and number of developers
        */