package day33_selfPractice.shape;

public class Rectangle extends Shape{

    private double width,length;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    public double perimeter() {
        return 2* (width * length);
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("\t* * * * * * *");
        for(int i=0; i<2; i++){
            System.out.println("\t*          *");
        }
        System.out.println("\t* * * * * * *");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "" + " {" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
