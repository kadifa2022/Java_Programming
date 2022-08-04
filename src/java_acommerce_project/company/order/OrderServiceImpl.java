package java_acommerce_project.company.order;



import java_acommerce_project.company.Cart;
import java_acommerce_project.company.Discount.Discount;
import java_acommerce_project.company.CheckoutService;
import java_acommerce_project.company.CustomerBalanceCheckoutServiceImpl;
import java_acommerce_project.company.MixPaymentCheckoutServiceImpl;

import java.time.LocalDateTime;
        import java.util.Scanner;
        import java.util.UUID;

import static java_acommerce_project.company.StaticConstants.DISCOUNT_LIST;
import static java_acommerce_project.company.StaticConstants.ORDER_LIST;


public class OrderServiceImpl implements OrderService{
    @Override
    public String placeOrder(Cart cart) {
        double amountAfterDiscount = cart.calculateCartTotalAmount();


        if (cart.getDiscountId() != null){
            try {
                Discount discount = findDiscountById(cart.getDiscountId());
                amountAfterDiscount = discount.calculateCartAmountAfterDiscountApplied(amountAfterDiscount);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("which payment option you would like to choose, Type 1 : customer balance, Type 2 : Mix (gift card + customer balance)");
        int paymentType = scanner.nextInt();
        boolean checkoutResult = false;
        switch (paymentType){
            case 1:
                CheckoutService customerBalanceCheckoutService = new CustomerBalanceCheckoutServiceImpl();
                checkoutResult = customerBalanceCheckoutService.checkout(cart.getCustomer(), amountAfterDiscount);
                break;
            case 2:
                CheckoutService mixPaymentCheckoutService = new MixPaymentCheckoutServiceImpl();
                checkoutResult = mixPaymentCheckoutService.checkout(cart.getCustomer(), amountAfterDiscount);
                break;
        }


        if (checkoutResult){
            Order order = new Order(UUID.randomUUID(), LocalDateTime.now(),
                    cart.calculateCartTotalAmount(), amountAfterDiscount,
                    cart.calculateCartTotalAmount() - amountAfterDiscount, cart.getCustomer().getId()
                    , "Placed", cart.getProductMap().keySet());
            ORDER_LIST.add(order);
            return "Order has been placed successfully";
        }else {
            return "Balance is insufficient. Please add money to your one of balances and try again.";
        }
    }

    private Discount findDiscountById(UUID discountId) throws Exception {
        for (Discount discount : DISCOUNT_LIST){
            if (discount.getId().toString().equals(discountId.toString())){
                return discount;
            }
        }
        throw new Exception("Discount couldn't found");
    }
}