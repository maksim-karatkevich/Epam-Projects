package dao;


import dao.impl.FileWorkerDAOImpl;

public class DAOFactory {
    private static final DAOFactory factory = new DAOFactory();

    private final FileWorkerDAOImpl fileWorkerDAOImpl = new FileWorkerDAOImpl();

    private DAOFactory(){}

    public static DAOFactory getInstance() { return factory; }

    public FileWorkerDAOImpl getFileWorkerDAOImpl(){
        return fileWorkerDAOImpl;
    }
}
