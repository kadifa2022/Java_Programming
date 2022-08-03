package java_acommerce_project.company.checkout.Catagory;

import java.time.LocalDateTime;
import java.util.UUID;

public class SkinCare extends Category{

    public SkinCare(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {
        return LocalDateTime.now();
    }


}