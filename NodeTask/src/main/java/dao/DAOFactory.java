package dao;


import dao.impl.FileWorkerDAO;

public class DAOFactory {
    private static final DAOFactory factory = new DAOFactory();

    private final FileWorkerDAO fileWorkerDAO = new FileWorkerDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance() { return factory; }

    public FileWorkerDAO getFileWorkerDAO(){
        return fileWorkerDAO;
    }
}
