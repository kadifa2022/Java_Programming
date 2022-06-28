package labs_.lab8_splitterApp;


/*
        Scanner scanner = new Scanner(System.in);
        //create user
        //ASK HOW MANY PEOPLE IN THE BUDGET PLANER?
        System.out.println("How many people will split the budget?");
        int userCount = scanner.nextInt();//5 people
                 // class name "User"
               ArrayList<User> userList = new Array.list<User>();
               int userCount=scanner.nextInt();

               //create user we create loop

        for (int i = 0; i < userCount; i++) {

            //create class

            String userName1 ="ozzy";//create a class from this objects//clas is blueprint(tamplet)
            String userEmail1 = "ozzy@gmail.com";

            String userName2 = "mike";
            String userEmail2 = "mike@gmail.com";*/
    /*    User user = new User();

        System.out.println("Name:");//objects to adding to ArrayList
        user.name = scanner.next();//assigning objects
        System.out.println("Email:");
        user.email = scanner.next();

        userList.add(user);
    }


}



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget?");

        //Create user
        ArrayList<User> userList = prepareUserLists(scanner);

        System.out.println("Added user count : " + userList.size());

        String [] optionList = prepareOptionList();


        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<optionList.length;i++){

                System.out.println(optionList[i] + ":" + (i+1));

            }

            int request =  scanner.nextInt();

            switch(request-1){
                case 0://user id from uses list

                    //ask expanse name,amount,user- (expense is objects-creating list of expenses like name, amount )database is where we keep informations

                    Expense expense = new Expense();

                    System.out.println("Expense name: "); // from creating list of names and then import information
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");//form list expense list
                    expense.amount = scanner.nextInt();

                    System.out.println("Which user made this expense? Just type user id: ");

                    //show all users: id:0 name: Ozzy
                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
                    }


                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;//user is Object

                    ArrayList<Expense> expenseList = new ArrayList<>();

                    expenseList.add(expense);


                    break;

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }

        }







    }


    public static ArrayList<User> prepareUserLists(Scanner scanner){

        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();

        for(int i=0;i<userCount;i++) {

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user);

        }

        return userList;

    }

    public static String[] prepareOptionList(){

                /*
        Creating options
        0 : Make Expense
        1 : List Specific Person Expense
        2 : List All Expenses
        3 : Make Split
        4 : List All Users
        5 : Close the budget


        String[] optionList = {"Make Expense","List Specific Person Expense","List All Expenses","Make Split","List All Users","Close the budget"};

        return optionList;

    }



}
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget?");

        //Users DB
        ArrayList<User> userList = prepareUserLists(scanner);


        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count : " + userList.size());

        String [] optionList = prepareOptionList();


        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<optionList.length;i++){

                System.out.println(optionList[i] + ":" + (i+1));

            }

            int request =  scanner.nextInt();

            switch(request-1){
                case 0:

                    //ask expanse name,amount,user

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");
                    expense.amount = scanner.nextInt();


                    System.out.println("Which user made this expense? Just type user id: ");

                    //show all users: id:0 name: Ozzy
                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
                    }


                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;



                    expenseList.add(expense);

                    break;

                case 1:

                    System.out.println("Please provide user name that you would like to search");
                    String userName = scanner.next();

                    User myUser = null;

                    for(User chosenUser : userList){

                        if(chosenUser.name.equals(userName)){
                            myUser = chosenUser;
                            break;

                        }
                    }

                    if(myUser == null){
                        System.out.println("User not exists!");
                        break;
                    }


                    ///List Specific Person Expense
                    //0 - expense amount : 100, expense by :0zzy
                    //1 - expense amount : 100, expense by :0zzy
                    //ozzy spent $ 200

                    int userExpenseAmount = 0;
                    int expenseCount=0;

                    for(int i=0;i<expenseList.size();i++){

                        if(expenseList.get(i).user.equals(userName)){

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;

                            System.out.println(expenseCount + " -expense amount:" + expenseList.get(i).amount + ",expense by :" + expenseList.get(i).user);
                        }

                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                    break;


                case 2:

                    for(int i = 0;i<expenseList.size();i++){
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }
                    break;
                case 3:

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split : splitList){

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);



                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }

        }







    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();


        //total 300
        //each person : 100

        for(Split split : splitList){

            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " need to give " + (-1 * (split.amount-amount)));
            }

        }





    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense : expenseList){

            Split split = existSplitList(expense.user,splitList);

            if(split != null){
                split.amount += expense.amount;

            }else{
                Split willbeAdded = new Split();
                willbeAdded.userName = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }




        }




        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }

        return null;   //break till 3:30 (5 review)

    }


    public static ArrayList<User> prepareUserLists(Scanner scanner){

        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();

        for(int i=0;i<userCount;i++) {

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user);

        }

        return userList;

    }

    public static String[] prepareOptionList(){



                /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {"Make Expense","List Specific Person Expense","List All Expenses","Make Split","List All Users","Close the budget"};

        return optionList;

    }



}
