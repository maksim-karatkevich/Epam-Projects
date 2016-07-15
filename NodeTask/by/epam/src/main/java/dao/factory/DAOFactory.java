package dao.factory;


import dao.impl.FileDAOImpl;

public class DAOFactory {

    private static final DAOFactory factory = new DAOFactory();

    private final FileDAOImpl fileDAOImpl = new FileDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return factory;
    }

    public FileDAOImpl getFileDAOImpl() {
        return fileDAOImpl;
    }


}
