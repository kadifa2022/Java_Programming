package java_acommerce_project;

import java.util.List;

public class CustomerClass {

    private String userName;
    private String email;

 private List<Address> address;

    public CustomerClass(String userName, String email) {//giving options to costumers
        this.userName = userName;
        this.email = email;
    }

    public CustomerClass(String userName, String email, List<Address> address) {
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }
}
