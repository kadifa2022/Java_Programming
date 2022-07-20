package day33_abstraction.day33_selfPractice.shape;

public class Triangle extends Shape {

    private double base, height, side1, side2;


    public Triangle(double base, double height, double side1, double side2) {
        super();
      setBase(base);
       setHeight(height);
       setSide1(side1);
        setSide2(side2);

    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 +base;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }




    @Override
    public void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*  ");

            }
            System.out.println();
        }
    }
        @Override
        public String toString() {
            return getClass().getSimpleName() +"{ "+
                    "base=" + base +
                    ", height=" + height +
                    ", side1=" + side1 +
                    ", side2=" + side2 +
                    ", area='" + area() + '\'' +
                    ", perimeter='" + perimeter() + '\'' +
                    '}';


        }

    }

