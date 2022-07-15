package labs_.lab12_oppException.restorantTask;

public class NoSuchPersonException extends RuntimeException{//create manually

    public NoSuchPersonException(String message) {
        super(message);//can add specific message
    }

}