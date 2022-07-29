package day29_selfPractice.Animal;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Lusy","Husky", 'M', 3,"small","black");
        System.out.println(dog);
        Cat cat = new Cat("Cupko","Ragdoll", 'F', 5, "Medium", "Black and white");
        System.out.println(cat);
        Fish fish= new Fish("Neno","clownfish", 'M', 3,"Small", "white");
        System.out.println(fish);
    }
}
