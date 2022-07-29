package java_acommerce_project.Catagory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Furniture extends Category{
    public Furniture(UUID iD, String name) {
        super(iD, name);
    }

    @Override
    public LocalDateTime finedDeliveryDueDate() {
        LocalDateTime localDateTime=LocalDateTime.now();

        return localDateTime.plusDays(1);
    }
}
