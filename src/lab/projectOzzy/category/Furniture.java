package lab.projectOzzy.category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Furniture extends Category{
    public Furniture(UUID id, String name) {//constructor
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {   // copied from electronic  Local date time
        LocalDateTime localDateTime =LocalDateTime.now();
        return localDateTime.plusDays(1);
    }
}
