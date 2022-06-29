package day30_selfPractice.Car;

public class TestCarObjects {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Toyota", "Camry","Black", 2000, 20000);
        Honda honda1 = new Honda("Honda", "cvr", "white", 2019, 30000);
        BMW bmw1 = new BMW("BMW", "320i", "White", 2014, 15000);
        Mercedes mercedes1 = new Mercedes("Mercedes","ML", "Pink", 2014, 25000 );
        Volvo volvo1 = new Volvo("Volvo", "XC40", "Yellow", 2022, 50000);


        System.out.println(mercedes1);

    }


}
