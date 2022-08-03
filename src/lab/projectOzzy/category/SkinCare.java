package lab.projectOzzy.category;

import java.time.LocalDateTime;
import java.util.UUID;

public class SkinCare extends Category{//generate constructor

    public SkinCare(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {     // copied from electronic class -Local date time.now()
        return LocalDateTime.now();
    }



}
