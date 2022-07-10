package day29_inheritance.AnimalTasks;

public class Animal {
    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public Animal(String john, String american_eagle, char m, int i, String small, String s) {
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {//set info method
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
       setColor(color);
    }

    public void eat() {
        System.out.println(name + " is eating"); //methods for eat
    }

    public void drink() {
        System.out.println(name + " is drinking water");//drink
    }

    public void sleep(){
        System.out.println(name+" is sleeping");//sleep
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {//to string methods
        return  getClass().getSimpleName()+ "{"+ //clas name can be changed -getClass.geSimpleName()
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
0. Animal
			attributes:
					name, breed, gender, size, color, age
			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */


