package java_acommerce_project.Catagory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category {//first concret class is responsible for

    public Electronic(UUID iD, String name) {
        super(iD, name);

    }

    @Override
    public LocalDateTime finedDeliveryDueDate() {
        LocalDateTime localDateTime= LocalDateTime.now();
        return localDateTime.plusDays(4);
    }

    @Override
    public String generateCategoryCode() {
        return "EL-" + getId().toString().substring(0,8);
    }
}