package day31_selfPractice.shape_MethodOverriding;

public class Circle extends Shape { //shape class constructor is default is called implicitly in circle class

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        super.draw();
        //code fragment that c

    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius ='" + radius + '\'' +
                ", area ='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';

    }
}