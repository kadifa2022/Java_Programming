package day17_selfPractice;

public class Address {

    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public static String country="United States", planet = "Earth";


    public Address(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
        public String toString(){
        return buildingNumber + " "+ street+ "\n" +city+ " "+state+ ", " + zipCode;
    }




}
