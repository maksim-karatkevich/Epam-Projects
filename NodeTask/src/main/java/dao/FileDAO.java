package dao;

import dao.exception.DAOException;
import model.NoteBook;
import service.factory.exception.ServiceException;

import java.io.*;


public interface FileDAO {

    void save(String path) throws IOException, ServiceException, DAOException;

    NoteBook load(String path, NoteBook noteBook) throws IOException, ClassNotFoundException, ServiceException, DAOException;
}
