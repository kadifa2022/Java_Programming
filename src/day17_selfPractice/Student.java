package day17_selfPractice;

public class Student {
    public String name;
    public int age;
    public char gender;
    public int grade;
    public String id;
    public boolean isFullTime;


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id='" + id + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, int age, char gender, int grade, String id, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
        this.isFullTime = isFullTime;


    }
        public void study() {
            if(isFullTime){
                System.out.println("student" + name + "with the id + " + id + "studying full time");
            }else{
                System.out.println("student" + name  + "with the id" + id + " studying half time");


            }


        }

}