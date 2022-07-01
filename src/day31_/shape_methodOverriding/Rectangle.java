package day31_.shape_methodOverriding;

public class Rectangle extends Shape {

    private double length,width;


    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2* (width * length);
    }

    @Override
    public void draw() {
        super.draw();

        for (int i = 0; i < 4; i++) {
            System.out.println("\t*       *");
        }

        System.out.println("\t* * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                " getName =' " + getName() + '\'' +
                ", length= ' " + length + '\'' +
                ", width=' " + width + '\'' +
                ", area= ' " + area() + '\'' +
                ", perimeter=' " + perimeter() + '\'' +
                '}';
    }
}
