package lab.projectOzzy;

import java_acommerce_project.company.DateGenerator;
import lab.projectOzzy.balance.Balance;
import lab.projectOzzy.balance.CustomerBalance;
import lab.projectOzzy.balance.GiftCardBalance;
import lab.projectOzzy.category.Category;
import lab.projectOzzy.discount.Discount;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;




public class main {
    public static void main(String[] args) {

        DateGenerator.createCostumer();    //1.we need static //we  can call through cass name , you can import and you can call methode directy
        DateGenerator.createCategory();                             //create class Customer (public static void)-
        DateGenerator.createProduct();
        DateGenerator.createBalance();
        DateGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer:");
        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++) {
            System.out.println("Type " + i + "for customer:" + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }
        //get the customer (object)           database      get scanner
        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

        //case 5 //created empty cart
        Cart cart = new Cart(customer);

        // create while loop to log in to application

        while (true) {//infinite loop

            System.out.println("what would you to do: Just type Id for selection");
            //create array - main methode to keep everything inside
            for (int i = 0; i < prepareManuOptions().length; i++) {
                System.out.println(i + "-"+prepareManuOptions()[i]);
            }
            int menuSelection= scanner.nextInt();
            switch (menuSelection) {

                case 0: //list category
                    for (Category category : StaticConstants.CATEGORY_LIST) {
                        System.out.println("Category Code:" + category.generateCategoryCode() + "category name:" + category.getName());
                    }
                    break;

                case 1:         //list products//product name, product category name
                    //exception handle with try and catch
                    try {
                        for (Product product : StaticConstants.PRODUCT_LIST) {                                       //created methode
                            System.out.println("Product name:" + product.getName() + "Product Category Name:" + product.getCategoryName());
                        }
                    } catch (
                            Exception e) {                                                      //exception from product //get name is index 1 milk
                        System.out.println("Product could not handle, because category not found for product name:" + e.getMessage().split(",")[1]);
                    }
                    break;
                case 2://list discount
                    for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                        System.out.println("Discount name:" + discount.getName() + "discount threshold amount " + discount.getThresholdAmount());
                    }
                    break;
                case 3:
                    CustomerBalance cBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());
                    double totalBalance = cBalance.getBalance() + gBalance.getBalance();
                    System.out.println("Total Balance:" + totalBalance);
                    System.out.println("Customer Balance:" + cBalance.getBalance());
                    System.out.println("Gift Card Balance:" + gBalance.getBalance());
                    break;
                case 4:
                    CustomerBalance customerBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());
                    System.out.println("Which account would you to add?");
                    System.out.println("Type 1 for Customer Balance:" + customerBalance.getBalance());
                    System.out.println("Type 2 for Gift Card Balance: " + giftCardBalance.getBalance());
                    int balanceAccountSelection = scanner.nextInt();
                    System.out.println("How much would you like to add? ");
                    double additionalAmount = scanner.nextInt();

                    switch (balanceAccountSelection) {
                        case 1:
                            customerBalance.addBalance(additionalAmount);
                            System.out.println("New Costumer Balance:" + customerBalance.getBalance());
                            break;

                        case 2:
                            giftCardBalance.addBalance(additionalAmount);
                            System.out.println("New Gift Card Balance:" + giftCardBalance);
                            break;
                    }
                    break;

                case 5:
                    Map<Product, Integer> map = new HashMap<>();
                    cart.setProductMap(map);//empty cart which is map integer for quantity
                    while (true) {   //while loop to keep adding more product
                        System.out.println("Which product you want to add  to your cart. For exit product selection Type: exit");
                        for (Product product : StaticConstants.PRODUCT_LIST) {
                            try {
                                System.out.println("id:" + product.getId() + "price: " + product.getPrice() + "product category" +
                                        product.getCategoryName() + "stock: " + product.getRemainingStack() +
                                        "product delivery due:" + product.getDeliveryDueDate());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());         //if product are not available and we need to use try and catch
                            }
                        }
                        String productId = scanner.next();//user is chosing Id -picked the product

                        try {
                            Product product= findProductById(productId);//product object -has all info. that we need
                            if (!putItemToCartIfStockAvailable(cart,product)){// checking first for available product-trying to put exception //if is not stack available
                                System.out.println("Stock is insufficient. Please try again");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Product does not exist, please try again");//
                            continue;
                        }
                        System.out.println("Do you want to add more product. Type Y for adding more, N for exit");
                        String decision = scanner.next();
                        if(!decision.equals("Y")){
                            break;

                        }

                    }
                    break;


                case 6:
                    break;

                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;



            }
       
        }
        
    }
    //case:5
   public static boolean putItemToCartIfStockAvailable(Cart cart, Product product){    //creating method to checked condition(how many remaining quantity) true or false
       System.out.println("Please provide product count");
       Scanner scanner = new Scanner(System.in);
       int count= scanner.nextInt();

       //how many existing product in your cart?//retrieve the value for cart product
       Integer cartCount= cart.getProductMap().get(product);

       if (cartCount != null && product.getRemainingStack() > cartCount + count ){//cart is not equal=0
           cart.getProductMap().put(product, cartCount + count);
               return true;
           }else if(product.getRemainingStack()> count){
           cart.getProductMap().put(product, count);
               return true;
           }

       return false;
    }

    private static Product findProductById(String productId) throws Exception{//need to add throws
        for(Product product :StaticConstants.PRODUCT_LIST){
            if(product.getId().toString().equals(product)){
                return product;
            }
        }
        throw new Exception("Product not found");
    }



        //2. case 3
        private static CustomerBalance findCustomerBalance(UUID customerId){
            for (Balance customerBalance:StaticConstants.CUSTOMER_BALANCE_LIST) {
                if(customerBalance.getCustomerId().toString().equals(customerId.toString())){
                    return (CustomerBalance) customerBalance;//Cast because of the Balance (
                }
            }//created new object and added to data
            CustomerBalance customerBalance = new CustomerBalance(customerId,0d);//if something don't exist assign 0
            StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);

            return customerBalance;
        }

    private static GiftCardBalance findGiftCardBalance(UUID customerId){
        for (Balance giftCardBalance:StaticConstants.GIFT_CARD_BALANCE_LIST) {
            if(giftCardBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance)  giftCardBalance;//Cast because of the Balance (
            }
        }//created new object and added to data
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);//if something don't exist assign 0
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

        return giftCardBalance;
    }



        //1
    //static can not call something not static
    // private-access modifier
    private static String[] prepareManuOptions(){
        return new String[]{"List Categories","List Products","List Discount", "See Balance", "Add Balance",
                    "Place an Order", "See Cart", "See Order Details", "See your address", "Close App"};
    }

}
