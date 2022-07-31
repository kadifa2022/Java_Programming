package java_acommerce_project.Catagory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category {//abstract class to abstract methods

    private UUID Id;
    private String name;

    public Category(UUID id, String name) {
        this.Id = id;
        this.name = name;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public abstract LocalDateTime finedDeliveryDueDate();

    public String generateCategoryCode(){
        return Id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
    }



    }




