package day29_selfPractice.Animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){//unique method
        System.out.println(name+ " is scratching");
    }

}
