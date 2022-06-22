package day26_selfPractice;

import java.sql.SQLOutput;

public class CydeoStudent {

    public String name,  id;
    public int age,grade,batchNumber,groupNumber;
    public char gender;
    public static String schoolName = "Cydeo";
    public static String magicWord = "Wooden Spoon";
    public static String proLanguage = "Java";

    public CydeoStudent(String name, String id, int age, int grade, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }
    public void study(){
        System.out.println(name + "is studying");
    }
    public void printSchoolName(){
        System.out.println("School Name" + schoolName);
    }
    public void printProgramingLanguage(){
        System.out.println("Learning" + proLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}
/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()



 */
