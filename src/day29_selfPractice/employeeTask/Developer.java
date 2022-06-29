package day29_selfPractice.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {





    private String programmingLanguage;


    public String getProgrammingLanguage(){

      return programmingLanguage;

    }
    public void setProgrammingLanguage(String programmingLanguage) {
      ArrayList<String>list=new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
      if(!list.contains(programmingLanguage)){
        invalidEntry();
      }
      this.programmingLanguage = programmingLanguage;
    }
    public void coding(){

        System.out.println(getName()+"is coding");
    }



    public Developer(String name, String jobTitle, String id, int age, char gender, double salary,String programmingLanguage) {
        super(name, jobTitle, id, age, gender, salary);
        setProgrammingLanguage(programmingLanguage);

    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + getName() + '\'' +
                "jobTitle='" + getJobTitle() + '\'' +
                "id='" + getId() + '\'' +
                "age='" + getAge() + '\'' +
                "salary='" + getSalary() + '\'' +
                "programmingLanguage='" + getProgrammingLanguage() + '\'' +
                '}';
    }
}












/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement



 */