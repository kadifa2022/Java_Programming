package java_acommerce_project;



import java_acommerce_project.Catagory.Category;
import java_acommerce_project.Catagory.Electronic;
import java_acommerce_project.Catagory.Furniture;
import java_acommerce_project.Catagory.SkinCare;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DateGenerator {
    public static void createCostumer() {

        Address address1Customer1 = new Address("7925", "Jones Branch Dr", "Suite 3300", "Saint Louis", "VA", "63125");
        Address address2Customer1 = new Address("825", "GeorgeTown Pky", "Suite 5355", "New York", "VA", "22036");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "Cikago", "VA", "22036");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(), "ozzy", "ozzy@cydeo.com", customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(), "mike", "mike@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);
    }
        public static void createCategory(){

            Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
            Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
            Category category3 = new SkinCare( UUID.randomUUID(),"Skin Care");

            StaticConstants.CATEGORY_LIST.add(category1);
            StaticConstants.CATEGORY_LIST.add(category2);
            StaticConstants.CATEGORY_LIST.add(category3);

        }
        public static void createProduct(){
        Product product1 = new Product(UUID.randomUUID(),"PS5",230.72, 7, 7 , StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(),"Glasses", 450.99,30, 25,StaticConstants.CATEGORY_LIST.get(0).getId());
      //  Product product3 = new Product(UUID.randomUUID(), "TV", 999.99, 20, 19,StaticConstants.CATEGORY_LIST.get(0),getId());




    }


}



