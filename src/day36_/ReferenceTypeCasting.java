package day36_;

import day29_inheritance.AnimalTasks.Animal;
import day29_inheritance.AnimalTasks.Dog;

public class ReferenceTypeCasting {


    public static void main(String[] args) {

        Dog dog = new Dog();
      //  Cat cat = new Dog();

        Animal animal = (Animal) new Dog();//Implicitly done child assign to parent

    }
}
