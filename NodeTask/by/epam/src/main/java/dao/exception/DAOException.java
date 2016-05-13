package dao.exception;


public class DAOException extends Exception{

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Exception ex) {
        super(message, ex);
    }
}
