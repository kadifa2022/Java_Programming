package day34_abstraction_Interface.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " +getName()+"is eating snake");

    }

    @Override
    public void fly() {//make

    }

    @Override
    public void hunt() {

    }
}