package java_acommerce_project.company;



import java_acommerce_project.company.checkout.Catagory.Category;
import java_acommerce_project.company.checkout.Catagory.Electronic;
import java_acommerce_project.company.checkout.Catagory.Furniture;
import java_acommerce_project.company.checkout.Catagory.SkinCare;
import java_acommerce_project.company.Discount.AmountBasedDiscount;
import java_acommerce_project.company.Discount.Discount;
import java_acommerce_project.company.Discount.RateBasedDiscount;
import java_acommerce_project.company.balance.Balance;
import java_acommerce_project.company.balance.GiftCardBalance;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DateGenerator {
    public static void createCostumer() {

        Address address1Customer1 = new Address("7925", "Jones Branch Dr", "Suite 3300", "63125", "VA");
        Address address2Customer1 = new Address("825", "GeorgeTown Pky", "Suite 5355", "22036", "VA");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "22036", "VA");

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
        Product product3 = new Product(UUID.randomUUID(), "Char", 30.87, 85, 85,StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(),"Milk",2.87,185,85,UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);

    }
    public static void createBalance(){
        Balance customerBalance= new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(),450.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(),500.00);

        Balance customerBalance;
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
    }

    public static void createDiscount(){

        Discount amountBasedDiscount = new AmountBasedDiscount(UUID.randomUUID(),"Buy 250 Free 50",250.00,50.00);
        Discount rateBasedDiscount = new RateBasedDiscount(UUID.randomUUID(),"Buy 500 Free %15",500.00,15.00);

        StaticConstants.DISCOUNT_LIST.add(amountBasedDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBasedDiscount);

    }


    public void createCustomer() {
    }
}








