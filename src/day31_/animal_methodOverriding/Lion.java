package day31_.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;//added to lion generate and set method nad override methode used

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }


    @Override
    public String toString() {//calling to string method from parent clas and adding boolean is africanLion
        return  super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }



}
