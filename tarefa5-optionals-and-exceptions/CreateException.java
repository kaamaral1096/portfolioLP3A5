public class CreateException extends Exception {
    public CreateException(String msg) {
        super(msg);
    }

    public CreateException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
