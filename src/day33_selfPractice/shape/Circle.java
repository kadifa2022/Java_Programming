package day33_selfPractice.shape;

public class Circle extends Shape {
    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    private double radius;

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
        return super.toString().replace("}" , " ")+
                ", radius=" + radius +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
