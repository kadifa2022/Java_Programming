package labs_.lab12_oppException.restorantTask;


public class Server extends Employee {

    public Server(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Server", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is serving the customers");
    }

    public void takeOrder(){
        System.out.println(getName()+" is taking customer orders");
    }

    public void cleanTable(){
        System.out.println(getName()+" is cleaning tables");
    }


}

/*
5. Create a subclass of employee named Server
			extra methods:
				takeOrder()
				cleanTable()
 */


/*
5. Create a subclass of employee named Server
			extra methods:
				takeOrder()
				cleanTable()
 */

