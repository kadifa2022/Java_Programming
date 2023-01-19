package day31_selfPractice.Animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;


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

    public void eat(){
        System.out.println("Lion" + getName() + "is eating deer");
    }

    public void roar(){
        System.out.println("Lion" +getName()+ " is roaring ");
    }

    @Override
    public String toString() {//calling parent toString() and use replace()to replace closed braces with string  add additional variable african lion to toString()
        return super.toString().replace("}", "")+
                ", African Lion ='" + isAfricanLion + '\'' +
                '}';
    }

    //    @Override //another way of toString()
//    public String toString() {
//        return getClass().getSimpleName() + "{" +
//                "name='" + getName() + '\'' +
//                ", breed='" + getBreed() + '\'' +
//                ", gender=" + getGender() +
//                ", age=" + getAge() +
//                ", size='" + getSize() + '\'' +
//                ", color='" + getColor() + '\'' +
//                ", African lion='" + isAfricanLion + '\'' +
//                '}';
//    }
}
