package day29_selfPractice.Animal;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="Lucy";
        dog.age=3;
        dog.gender='M';
        dog.breed="Husky";
        dog.color="White";
        dog.size="Large";
        dog.bark();// unique methods
        dog.sleep();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.name = "Cupko";
        cat.breed = "Ragdoll";
        cat.age=5;
        cat.color= "black and white";
        cat.gender='F';
        cat.size= "Medium";
        cat.scratch();//unique methods
        cat.sleep();

        System.out.println(cat);

        Fish fish = new Fish();
        fish.age=1;
        fish.name="Mimo";
        fish.breed="ClownFish";
        fish.gender='F';
        fish.size="Small";
        fish.color="white";
        fish.swim();
        fish.sleep();

        System.out.println(fish);


    }
}
