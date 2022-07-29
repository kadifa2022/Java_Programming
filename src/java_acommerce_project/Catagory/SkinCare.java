package java_acommerce_project.Catagory;

import java.time.LocalDateTime;
import java.util.UUID;

public class SkinCare extends Category{
    public SkinCare(UUID iD, String name) {
        super(iD, name);
    }

    @Override
    public LocalDateTime finedDeliveryDueDate() {
        return  LocalDateTime.now();
    }
}
