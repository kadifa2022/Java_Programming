package day29_inheritance.AnimalTasks;

public class Cat extends Animal{//cat is an Animal

    public void meow(){
        System.out.println(getName() +" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

}


