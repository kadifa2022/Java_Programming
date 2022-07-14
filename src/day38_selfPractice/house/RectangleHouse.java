package day38_selfPractice.house;

public class RectangleHouse extends House{

    double width;
    double length;

    public RectangleHouse(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public double areaOfHouse() {
        return width*length;
    }
}
