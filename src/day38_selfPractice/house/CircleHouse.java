package day38_selfPractice.house;

public class CircleHouse extends House{


    public CircleHouse(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double radius;




    @Override
    public double areaOfHouse() {
        return radius*radius*Math.PI;
    }
}
