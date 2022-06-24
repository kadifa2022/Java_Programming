package day28_selfPractice.circle;

public class TestCircleObject {
    public static void main(String[] args) {

        Circle circle1= new Circle(3.14);

        circle1.calcArea();
        circle1.perimeter();

        System.out.println(circle1.getRadius());
        System.out.println(circle1.perimeter());
        System.out.println(circle1.calcArea());




    }

}
