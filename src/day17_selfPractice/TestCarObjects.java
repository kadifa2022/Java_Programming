package day17_selfPractice;



public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Mercedes";
        car1.color = "Green";
        car1.model = "CLS-Klasse";
        car1.year = 2000;
        car1.price = 20000;


        Car car2 = new Car();
        car2.setInfo("BMW","Blue", "Class F", 2019, 30000);

        Car car3 = new Car();
        car3.setInfo("Audi", "Black","suv", 2022, 45000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}

