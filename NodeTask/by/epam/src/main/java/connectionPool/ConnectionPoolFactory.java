package connectionPool;

/**
 * Created by maksim_kevich on 7/15/16.
 */
public class ConnectionPoolFactory {

    private static final ConnectionPoolFactory factory = new ConnectionPoolFactory();

    private final ConnectionPool connectionPool = new ConnectionPool();

    private ConnectionPoolFactory() {
    }


    public static ConnectionPoolFactory getInstance() {
        return factory;
    }

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }


}
