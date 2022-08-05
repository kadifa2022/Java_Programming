package lab.projectOzzy.discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{
    private Double discountAmount;//only unique for amountBasedDiscount- generate with

    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount = discountAmount; //added additional
    }

    @Override//chart is not our responsibility
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }
}
