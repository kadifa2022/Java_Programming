package lab.projectOzzy;

import lab.projectOzzy.balance.Balance;
import lab.projectOzzy.category.Category;
import lab.projectOzzy.discount.Discount;

import java.util.ArrayList;
import java.util.List;

public class StaticConstants {//static constants  is created to save data
    //save costumer -list //should be final

    public static final List<Customer> CUSTOMER_LIST= new ArrayList<>();//saved customers to list-coming from DataGenerator-Class
    public static final List<Category> CATEGORY_LIST= new ArrayList<>();
    public static final List<Product> PRODUCT_LIST= new ArrayList<>();
    public static final List<Balance>CUSTOMER_BALANCE_LIST=new ArrayList<>();
    public static final List<Balance>GIFT_CARD_BALANCE_LIST= new ArrayList<>();
    public static final List<Discount>DISCOUNT_LIST=new ArrayList<>();


}
