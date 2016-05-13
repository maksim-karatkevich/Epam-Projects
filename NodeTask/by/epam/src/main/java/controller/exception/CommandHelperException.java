package controller.exception;


public class CommandHelperException extends Exception {

    public CommandHelperException(String message) {
        super(message);
    }

    public CommandHelperException(String message, Throwable cause) {
        super(message, cause);
    }
}
