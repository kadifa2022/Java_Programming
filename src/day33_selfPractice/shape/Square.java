package day33_selfPractice.shape;

public class Square extends Shape{
    public Square(double side) {
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t*          *");

        }
        System.out.println("\t* * * * * *");


    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
               '}';
    }
}
