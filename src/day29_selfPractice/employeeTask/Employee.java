package day29_selfPractice.employeeTask;

public class Employee {

    private String name,jobTitle, id;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, String jobTitle, String id, int age, char gender, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setId(id);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public void invalidEntry(){
        System.err.println("Invalid Entry");
        System.exit(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age <18 ||age >65){
            invalidEntry();
        }

        this.age = age;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M'|| gender == 'F')){
            invalidEntry();
        }
        this.gender = gender;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if(salary <0 ){
            invalidEntry();
        }
        this.salary = salary;
    }

    public String toString(){
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
    }

/*

employeeTask:
	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement


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


	3. Create a custom Class named Teacher
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				teching()
				toString(): prints teacher object info when the object is passed in the print statement

	4. Create a custom Class named Driver
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints driver object info when the object is passed in the print statement
 */