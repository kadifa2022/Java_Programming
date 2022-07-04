package day33_selfPractice.shape;

public abstract class Shape {
    private String name;

    public Shape(){
        setName(getClass().getSimpleName());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double perimeter();
    public abstract double area();
    public abstract  void draw();



    @Override
    public String toString() {
        return name+ "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter=' " + perimeter() +
                '}';
    }
}

