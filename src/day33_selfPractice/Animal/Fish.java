package day33_selfPractice.Animal;

public class Fish extends Animal{


    public Fish(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println("Fish " +getName()+ " is eating fish food");

    }
}
