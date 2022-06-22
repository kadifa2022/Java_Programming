package day26_selfPractice;

public class Circle {
    public double radius;



    public double diameter;
    public  static double pi=3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter =  2 * radius;
    }
     public double circleArea(){
        double area = pi*(this.radius*this.radius);
        return area;
     }
     public double circlePerimeter(){
        double perimeter=2*pi*this.radius;
        return perimeter;
     }
     public  static void printPi(){
         System.out.println(pi);
     }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + circleArea() +
                ", perimeter=" + circlePerimeter() +
                ", p=" + pi +

                '}';
    }
}


/*Circle

        Task:
        1. Create a class named Circle:

        Attributes:
        instance: radius, diameter
static: pi

        Add a constructor that can set All the fields (instances)
        HINT: we only need to know the radius to set the radius & diameter

        Actions:
        calcArea(): returns the area of Circle
        calcPerimeter(): returns the perimeter of Circle
        printPi(): displays PI value
        toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



 */
