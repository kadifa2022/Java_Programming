package lab.projectOzzy.category;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category {                                        //all common things


            //category id supposed match with product iD
    private UUID  id; //can't access is private -only with GETTER -CREATE GETTER                                                    //if we're inheriting something can't be final
    private String name;                                                //this.keyword create constructor // for chaining

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

                                                              //IF WE DON'T KNOW IMPLEMENTATION/CALCULATION for (different product)WE CAN
                                                                   // PUT ABSTRACT class to define ABSTRACT METHODE such as time , delivery time

    public abstract LocalDateTime findDeliveryDueDate();                 //if we have abstract methode in the cass-class must be abstract or interface


            public String generateCategoryCode(){//category code-UUid-change to string -8 character long -concat+-+concat substring with first two character
                return id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
            }


    public UUID getId() {     //based of the needs created getter
        return id;
    }

    public String getName() {
        return name;
    }
}
