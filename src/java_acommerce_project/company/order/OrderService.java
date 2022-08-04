package java_acommerce_project.company.order;



import java_acommerce_project.company.Cart;

public interface OrderService {
    String placeOrder(Cart cart);
}