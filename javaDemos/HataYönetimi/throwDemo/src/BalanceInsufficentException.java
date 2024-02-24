public class BalanceInsufficentException extends Exception{
    String Message;
    public BalanceInsufficentException(String message){
        this.Message = message;

    }

    @Override
    public String getMessage() {
        return this.Message;
    }
}
