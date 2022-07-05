package day34_abstraction_Interface.animalTask;

public class Dog extends Animal implements Playable{//add interface and override


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println("Dog " +getName()+"is eating dog food");

    }

}
