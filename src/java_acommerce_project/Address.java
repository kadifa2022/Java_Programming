package java_acommerce_project;

public class Address {//encaptulation hide

    private String streetNumber;
    private String streetName;
    private String additionalAddress;
    private String zipCode;
    private String state;

    public Address(String streetNumber, String streetName, String additionalAddress, String zipCode, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.additionalAddress = additionalAddress;
        this.zipCode = zipCode;
        this.state = state;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setAdditionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }
}
