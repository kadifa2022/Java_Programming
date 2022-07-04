package day33_selfPractice.Animal;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog " +getName()+ " is eating dog food");

    }
}
