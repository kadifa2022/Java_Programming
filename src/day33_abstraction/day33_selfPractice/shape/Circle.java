package day33_abstraction.day33_selfPractice.shape;

public class Circle extends Shape {
    private double radius;
    public final static double pi;
    public Circle(double radius) {

        setRadius(radius);
    }
    static{
        pi=3.14;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double perimeter() {
        return 2* pi* radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("  *  *  ");
        System.out.println("*      *");
        System.out.println("  *  *  ");

    }

    @Override
    public String toString() {
        return getName()+ "{"+
                ", radius=" + radius +
                ", perimeter='" + perimeter() + '\'' +
                ", area='" + area() + '\'' +
                '}';
    }
}
