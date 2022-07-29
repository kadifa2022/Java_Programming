package day29_selfPractice.Animal;

public class Animal {//for all animal common features-attributes

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
    }

    public Animal() {

    }


    //methods /instance

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {//to string is methods
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
