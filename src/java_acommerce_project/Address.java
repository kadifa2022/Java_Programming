package java_acommerce_project;

public class Address {//encaptulation hide
    private String streetNumber, streetName, additionalAddressLine, city,state, zipCode;

    public Address(String streetNumber, String streetName, String additionalAddressLine, String city, String state, String zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.additionalAddressLine = additionalAddressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAdditionalAddressLine() {
        return additionalAddressLine;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}



