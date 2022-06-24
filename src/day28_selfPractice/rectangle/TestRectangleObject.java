package day28_selfPractice.rectangle;

public class TestRectangleObject {


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3,3);


        rectangle1.calcArea();
        rectangle1.calcPerimeter();
        rectangle1.setWidth(6);
        rectangle1.getLength(7);

        System.out.println(rectangle1);

    }
}
