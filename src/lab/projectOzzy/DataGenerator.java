package lab.projectOzzy;



import lab.projectOzzy.balance.Balance;
import lab.projectOzzy.balance.CustomerBalance;
import lab.projectOzzy.balance.GiftCardBalance;
import lab.projectOzzy.category.Category;
import lab.projectOzzy.category.Electronic;
import lab.projectOzzy.category.Furniture;
import lab.projectOzzy.category.SkinCare;
import lab.projectOzzy.discount.AmountBasedDiscount;
import lab.projectOzzy.discount.Discount;
import lab.projectOzzy.discount.RateBasedDiscount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCostumer(){
        Address address1Costumer1=new Address("7925","Jones Branch Dr", "Suite 3300","22102","VA");
        Address address2Costumer1=new Address("825","GeorgeTown Pky", "Suite 5300","22036","VA");
        Address address1Costumer2=new Address("5924","Lee dr", "House","24030","VA");
        //create costumer

        List <Address> costumer1AddressList = new ArrayList<>();//list of addresses ArrayList

        costumer1AddressList.add(address1Costumer1);//add customers
        costumer1AddressList.add(address2Costumer1);

        Customer customer1=new Customer(UUID.randomUUID(),"OZZY", "ozzy@cydeo.com", costumer1AddressList);//added info to date
        Customer customer2=new Customer(UUID.randomUUID(),"MIKE","mike@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);


    }

    public static void createCategory(){   //polymorphism check-category is abstract extending class--because is delivery due time

        Category category1 = new Electronic(UUID.randomUUID(),"Electronic");//put in dataBase
        Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(),"SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);

    }
    public static void createProduct(){
                                                                                                            //add-go to StaticConstants data-select category list.
        Product product1 = new Product(UUID.randomUUID(),"PSP",230.79,7,7,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(),"XBOX",120.00, 15,15,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(),"Chair", 20.00,20,20,StaticConstants.CATEGORY_LIST.get(1).getId());


        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);

    }
    public static void createBalance(){//Polymorphism-call New customerBalance

                                                    //for customerId?-get to customer date base and chose customers(not random customer)
        Balance customerBalance= new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 450.00);
        Balance giftCardBalance= new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(),500.00);//go to staticConstants and SAVE DATE

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }
    public static void createDiscount(){//Polymorphism

        Discount amountBasedDiscount= new AmountBasedDiscount(UUID.randomUUID(),"Buy 250 Free 50",250.00,50.00);
        Discount rateBasedDiscount=new RateBasedDiscount(UUID.randomUUID(),"Buy 500 get Free %15",500.00,15.00);

        StaticConstants.DISCOUNT_LIST.add(amountBasedDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBasedDiscount);
    }





    }





