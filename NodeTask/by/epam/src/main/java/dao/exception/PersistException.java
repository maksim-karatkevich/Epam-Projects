package dao.exception;

/**
 * Created by maksim_kevich on 7/14/16.
 */
public class PersistException extends Throwable {
    public PersistException(Exception e) {
        super(e);
    }

    public PersistException(String s) {
        super(s);
    }
}
