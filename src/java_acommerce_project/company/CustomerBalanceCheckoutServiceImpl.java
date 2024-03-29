package java_acommerce_project.company;


import java_acommerce_project.company.balance.Balance;
import java_acommerce_project.company.balance.CustomerBalance;

import java.util.UUID;


public class CustomerBalanceCheckoutServiceImpl implements CheckoutService {
    @Override
    public boolean checkout(Customer customer, int totalAmount) {
        CustomerBalance customerBalance = findCustomerBalance(customer.getId());
        double finalBalance = customerBalance.getBalance() - totalAmount;
        if (finalBalance > 0){
            customerBalance.setBalance(finalBalance);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        return false;
    }

    private static CustomerBalance findCustomerBalance(UUID customerId){
        for(Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST){
            if(customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);

        return customerBalance;
    }

    @Override
    public boolean checkout(Customer customer, double totalAmount) {
        return false;
    }
}