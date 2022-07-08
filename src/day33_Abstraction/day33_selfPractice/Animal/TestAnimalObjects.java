package day33_Abstraction.day33_selfPractice.Animal;

public class TestAnimalObjects {

    public static void main(String[] args) {


        Cat cat = new Cat("Cupko","Tucsido", 'F');
        Dog dog = new Dog("Benji", "Golden Retriver", 'M');
        Fish fish = new Fish("Lupka", "Golden fish",'F');

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);

        cat.eat();
        dog.eat();
        fish.eat();
    }
}
