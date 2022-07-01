package day31_.animal_methodOverriding;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat() {//In order to override -must happen in subclass-must be same method name or more visible
        System.out.println("Cat "+getName() + " is eating cat food");//only instances can be overrider-no statics-no private access modifier
    }


    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours ina day");//by calling supper.-is in same class and super() overrider methode-same package and for subclass
    }
    public void drink(){
        System.out.println("Cat " + getName() + " drinking tee");
    }
    public void scratch() {
        System.out.println("Cat " + getName() + "is scratching");//additional variable


    }

}

/*
public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat() {
        System.out.println("Cat "+getName() + " is eating cat food");
    }

    public void sleep() {
        System.out.println("Cat "+getName() + " sleeps 12 hours ina day");
    }


    public void scratch(){
        System.out.println("Cat "+getName() + " is scratching");
    }


}
 */