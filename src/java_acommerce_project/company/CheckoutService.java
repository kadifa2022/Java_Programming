package java_acommerce_project.company;




public interface CheckoutService {
    boolean checkout(Customer customer, int totalAmount);

    boolean checkout(Customer customer, Double totalAmount);

    boolean checkout(Customer customer, double totalAmount);
}


