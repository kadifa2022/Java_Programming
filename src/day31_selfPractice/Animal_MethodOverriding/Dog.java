package day31_selfPractice.Animal_MethodOverriding;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void sleep() {
        System.out.println("Dog" + getName()+ "sleeps 10 hours a day");
    }


    public void drink() {
        System.out.println("Dog" + getName()+ "is drinking water");
    }

    public void eat(){
        System.out.println("Cat" + getName()+ "is eating cat food");
    }
    public void bark(){
        System.out.println("Dog " +getName()+ "is barking");
    }



}
