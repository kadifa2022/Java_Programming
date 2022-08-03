package lab.projectOzzy.category;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category {                                        //all common things



    private UUID  id;                                                   //if we're inheriting something can't be final
    private String name;                                                //this.keyword create constructor // for chaining

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }                                                               //IF WE DON'T KNOW IMPLEMENTATION/CALCULATION for (different product)WE CAN
                                                                   // PUT ABSTRACT class to define ABSTRACT METHODE such as time , delivery time

    public abstract LocalDateTime findDeliveryDueDate();           //if we have abstract methode in the cass-class must be abstract or interface

}
