package customException;

public class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}
