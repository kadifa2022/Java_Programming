package day33_selfPractice.shape;

public class TestShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(3.0);
        Rectangle rectangle =new Rectangle(6.0, 3.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 4.0,5.0, 5.0);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);

        triangle.draw();
        square.draw();
        rectangle.draw();
        circle.draw();

    }

}
