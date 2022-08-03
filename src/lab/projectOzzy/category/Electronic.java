package lab.projectOzzy.category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category {
    public Electronic(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {  // Local date time copy to furniture and skin care
        LocalDateTime localDateTime =LocalDateTime.now();
        return localDateTime.plusDays(4);
    }


    @Override
    public String generateCategoryCode() {//override the method from category class-ba
        return "EL-" + getId().toString().substring(0,8);
        //      EL-    UUID CHANGE TO STRING -8CHARACTER LONG
    }


}
/*
// First concrete class is RESPONSIBLE FOR IMPLEMENTATION OF abstract methode
              extend class and call manually constructor//
             this. keyword-in the same class for constructor channing
                                super is used if you want to call something from child to parent class
                                               when you inside child if you want to call anything from parent we have to use super keyword
                                                          super() call from parent class inside the child class




 */