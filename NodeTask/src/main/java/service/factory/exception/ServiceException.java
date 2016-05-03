package service.factory.exception;


public class ServiceException extends Exception {

    public ServiceException(String massage) {
        super(massage);
    }

    public ServiceException(String massage, Exception ex) {
        super(massage, ex);
    }
}
