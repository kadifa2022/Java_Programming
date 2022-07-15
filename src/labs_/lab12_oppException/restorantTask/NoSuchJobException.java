package labs_.lab12_oppException.restorantTask;

public class NoSuchJobException extends RuntimeException {

    public NoSuchJobException(String exceptionMsg){
        super(exceptionMsg); //displays the specified message as an exception message -super keyword
        //  System.out.println(exceptionMsg);
    }

    /*
    public static void main(String[] args) {
       // throw new RuntimeException("Something went wrong!");
      //  throw new NoSuchJobException("Invalid Job");
    }
     */

}