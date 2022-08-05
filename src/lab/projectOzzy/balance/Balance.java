package lab.projectOzzy.balance;

import java.util.UUID;

public abstract class Balance {

    private UUID customerId;
    private Double balance;

    public Balance(UUID customerId, Double balance) {//constructor
        this.customerId = customerId;
        this.balance = balance;
    }
    //if we have abstract method the cass must be abstract
    //return type Double
    public abstract Double addBalance(Double additionalBalance);// first CONCRETE class WHICH IS EXTENDING BALANCE ABSTRACT CLASS needs IMPLEMENTS abstract methode

    public UUID getCustomerId() {//encapsulation- Hiding data with the private/ instead of setter using constructor to set value/ can be used setter
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {//call setters for change balance
        this.balance = balance;
    }
}
