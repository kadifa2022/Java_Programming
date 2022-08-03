package lab.projectOzzy.category;

import java.util.UUID;
                                                      // First concrete class is RESPONSIBLE FOR IMPLEMENTATION OF abstract methode
public class Electronic extends Category{             //extend class and call manually constructor//
    public Electronic(UUID id, String name) {         //this. keyword-in the same class for constructor channing
        super(id, name);                              //super is used if you want to call something from child to parent class
    }                                                 //when you inside child if you want to call anything from parent we have to use super keyword
}                                                     //super() call from parent class inside the child class


