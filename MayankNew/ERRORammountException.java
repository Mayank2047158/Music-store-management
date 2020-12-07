package MayankNew;

public class ERRORammountException extends Exception{

    String message;
    
    public ERRORammountException(String message) {
        super(message);
        this.message = message;
    }       
}
