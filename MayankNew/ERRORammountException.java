package MayankNew;

public class ERRORammountException extends Exception{ //userdefined exception

    String message;
    
    public ERRORammountException(String message) {
        super(message);             // call the constructor of parent Exception
        this.message = message;
    }       

   
}
