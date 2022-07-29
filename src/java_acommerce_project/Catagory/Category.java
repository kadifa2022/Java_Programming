package java_acommerce_project.Catagory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category {//abstract class to abstract methods

    private UUID id;
    private String name;

    public Category(UUID iD, String name) {
        this.id = iD;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract LocalDateTime finedDeliveryDueDate();

    public String generateCategoryCode(){
        return id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
    }



    }




