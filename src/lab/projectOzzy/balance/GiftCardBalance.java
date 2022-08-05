package lab.projectOzzy.balance;

import java.util.UUID;

public class GiftCardBalance extends Balance{


    public GiftCardBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionBalance=additionalBalance * 10/100;//how to add promotionBalance and then
        setBalance(getBalance() + additionalBalance + promotionBalance);
        return getBalance();
    }
}
