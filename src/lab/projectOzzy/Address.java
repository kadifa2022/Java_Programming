package lab.projectOzzy;

public class Address {//1-start with address, OOP encapsulation,private,constructor-setting everything though constructor getter
                                      //
    private String streetNumber;
    private String streetName;
    private String additionalStreetName;
    private String zipCode;
    private String state;

    public Address(String streetNumber, String streetName, String additionalStreetName, String zipCode, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.additionalStreetName = additionalStreetName;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAdditionalStreetName() {
        return additionalStreetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }
}
