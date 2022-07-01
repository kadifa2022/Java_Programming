package day31_.shape_methodOverriding;

public class TestSquareObjects {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        Rectangle rectangle= new Rectangle(5,4);
        System.out.println(rectangle);
        rectangle.draw();

        Triangle triangle = new Triangle(3,3,3,3);
        System.out.println(triangle);
        triangle.draw();

        Circle circle = new Circle(3.14);
        System.out.println(circle);
        circle.draw();









    }
}
