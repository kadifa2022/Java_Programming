package java_acommerce_project.company;


    import com.company.Customer;

public interface CheckoutService {
    boolean checkout(Customer customer, int totalAmount);

    boolean checkout(Customer customer, Double totalAmount);
    }


