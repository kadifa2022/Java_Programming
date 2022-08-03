package lab.projectOzzy;



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

        Customer customer1=new Customer(UUID.randomUUID(),"OZZY", "ozzy@cydeo.com", costumer1AddressList);//added info
        Customer customer2=new Customer(UUID.randomUUID(),"MIKE","mike@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);







    }





    }





