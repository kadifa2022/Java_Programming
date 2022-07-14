package day38_selfPractice.house;

public class SquareHouse extends House{

    double sideOfSquare;
    public SquareHouse(String name, double sideOfSquare) {
        super(name);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double areaOfHouse() {
        return sideOfSquare*sideOfSquare;
    }
}
