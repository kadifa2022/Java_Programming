package lab.projectOzzy;

import java.util.List;
import java.util.UUID;

public class Customer {   //two constructor  (overloading constructor)//we provide
    UUID id;
    private String userName;
    private String emil;
    private List<Address> address;//create two constructor (overloaded constructor)

    public Customer(UUID id, String userName, String emil) {
        this.id = id;
        this.userName = userName;
        this.emil = emil;
    }

    public Customer(UUID id, String userName, String emil, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.emil = emil;
        this.address = address;
    }

    public UUID getId() {//getters with everything
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmil() {
        return emil;
    }

    public List<Address> getAddress() {
        return address;
    }
}