package lab.projectOzzy;

import java_acommerce_project.company.DateGenerator;
import lab.projectOzzy.category.Category;

import java.util.Scanner;

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

        // create while loop to log in to application

        while (true) {//infinite loop

            System.out.println("what would you to do: Just type Id for selection");
            //create array - main methode to keep everything inside
            for (int i = 0; i < prepareManuOptions().length; i++) {
                System.out.println(i + "-"+prepareManuOptions()[i]);
            }
            int menuSelection= scanner.nextInt();
            switch (menuSelection){

                case 0: //list category
                    for(Category category:StaticConstants.CATEGORY_LIST){
                        System.out.println("Category Code:"+ category.generateCategoryCode()+ "category name:" + category.getName());
                    }
                    break;

                case 1://list products//product name, product category name
                   for (Category category: StaticConstants.CATEGORY_LIST){

                   }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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






    //static can not call something not static
    // private-access modifier
    private static String[] prepareManuOptions(){
        return new String[]{"List Categories","List Products","List Discount", "See Balance", "Add Balance",
                    "Place an Order", "See Cart", "See Order Details", "See your address", "Close App"};
    }

}
