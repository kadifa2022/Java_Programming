package day29_selfPractice.Animal;

public class Dog extends Animal{


    //extends animal class-all features

    public void bark() {//unique methods jus for the Dog
        System.out.println(name + " is barking");

    }
        public Dog(String name, String breed,char gender, int age, String size,String color){
        super(name, breed,gender,age,size,color);
        }


}
