package lab.projectOzzy.balance;

import java.util.UUID;

public class CustomerBalance extends Balance{//WE need to call parent constructor super/reason-to create object from CustomerBalance/will be initial in parent class


    public CustomerBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {//after using setter in Balance (parent clas) than set the return
        setBalance(getBalance() + additionalBalance);//set the balance first and add additional balance
        return getBalance();
    }
}
